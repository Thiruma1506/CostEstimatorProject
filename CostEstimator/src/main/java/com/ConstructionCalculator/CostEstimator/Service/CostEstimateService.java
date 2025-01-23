package com.ConstructionCalculator.CostEstimator.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ConstructionCalculator.CostEstimator.Dto.InputDTO;
import com.ConstructionCalculator.CostEstimator.Model.CostEstimate;
import com.ConstructionCalculator.CostEstimator.Repository.CostEstimateRepository;

@Service
public class CostEstimateService {

    @Autowired
    private CostEstimateRepository costEstimateRepository;

    @Autowired
    private WebClient.Builder webClientBuilder;

    public CostEstimate calculateCost(Long inputId) {
        // Fetch input data from the Inputs service
        InputDTO inputDTO = fetchInputDetails(inputId);

        if (inputDTO == null) {
            throw new RuntimeException("Failed to fetch input details from Inputs Service");
        }

        // Determine cost per square foot based on the construction type
        String constructionType = inputDTO.getConstructionType();
        double costPerSqFt = switch (constructionType) {
            case "InteriorDesign" -> 1200;
            case "NewConstruction" -> 1500;
            case "Renovation" -> 1000;
            default -> throw new IllegalArgumentException("Invalid construction type: " + constructionType);
        };

        // Calculate total cost considering the number of floors
        double totalCost = inputDTO.getBuiltupArea() * inputDTO.getTotalFloor() * costPerSqFt;

        // Save and return the estimate
        CostEstimate estimate = new CostEstimate();
        estimate.setInputId(inputDTO.getId());
        estimate.setBuiltupArea(inputDTO.getBuiltupArea());
        estimate.setTotalCost(totalCost);
        return costEstimateRepository.save(estimate);
    }

    public List<CostEstimate> getAllEstimates() {
        return costEstimateRepository.findAll();
    }

    public Optional<CostEstimate> getCostEstimate(Long inputId) {
        return costEstimateRepository.findByInputId(inputId);
    }

    // Fetch Input details using WebClient
    private InputDTO fetchInputDetails(Long inputId) {
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:8080/api/inputs/getid/" + inputId)
                .retrieve()
                .bodyToMono(InputDTO.class)
                .block(); // Block to wait for the response
    }
}
