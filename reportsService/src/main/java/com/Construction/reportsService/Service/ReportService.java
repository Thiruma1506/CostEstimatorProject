package com.Construction.reportsService.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.Construction.reportsService.Dto.CostEstimatorDto;
import com.Construction.reportsService.Dto.MaterialCostDto;
import com.Construction.reportsService.Dto.ReportResponseDto;
import com.Construction.reportsService.Dto.UserInputDto;
import com.Construction.reportsService.Model.Report;
import com.Construction.reportsService.Repository.ReportRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ReportService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private ReportRepository reportRepository;

    public ReportResponseDto generateReport(Long inputId) {
        // Fetch User Input
        UserInputDto userInput = fetchUserInput(inputId);

        // Fetch Cost Estimate
        CostEstimatorDto costEstimate = fetchCostEstimate(inputId);

        // Fetch Material Costs
        List<MaterialCostDto> materialCosts = fetchMaterialCosts(inputId);

        // Save report to database
        Report report = saveReport(inputId, userInput, costEstimate, materialCosts);
        
        // Create and return response DTO
        return new ReportResponseDto(costEstimate,materialCosts, report.getTotalCost(),userInput);
       
    }

    private UserInputDto fetchUserInput(Long inputId) {
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:8080/api/inputs/getid/" + inputId)
                .retrieve()
                .bodyToMono(UserInputDto.class)
                .block();
    }

    private CostEstimatorDto fetchCostEstimate(Long inputId) {
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:8081/api/cost-estimates/calculate/" + inputId)
                .retrieve()
                .bodyToMono(CostEstimatorDto.class)
                .block();
    }

    private List<MaterialCostDto> fetchMaterialCosts(Long inputId) {
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:8083/api/materials/" + inputId)
                .retrieve()
                .bodyToFlux(MaterialCostDto.class)
                .collectList()
                .block();
    }

    private Report saveReport(Long inputId, UserInputDto userInput, CostEstimatorDto costEstimate, List<MaterialCostDto> materialCosts) {
        Report report = new Report();
        report.setInputId(inputId);
        report.setUserName(userInput.getUserName());
        report.setUserEmail(userInput.getUserEmail());
        report.setTotalCost(costEstimate.getTotalCost());
        report.setCreatedAt(new Date());
        report.setUpdatedAt(new Date());

        // Serialize material details to JSON
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            report.setMaterialDetails(objectMapper.writeValueAsString(materialCosts));
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to serialize material details", e);
        }

        return reportRepository.save(report);
    }
    
}
