package com.Construction.reportsService.Dto;

import java.util.List;

public class ReportResponseDto {
    private UserInputDto userInput;
    private List<MaterialCostDto> materialCosts;
    private CostEstimatorDto costEstimate;
    private Double totalCost;

    public ReportResponseDto() {
    }

    public ReportResponseDto(CostEstimatorDto costEstimate,List<MaterialCostDto> materialCosts, Double totalCost, UserInputDto userInput) {
        this.costEstimate = costEstimate;
        this.materialCosts = materialCosts;
        this.totalCost = totalCost;
        this.userInput = userInput;
    }

    public UserInputDto getUserInput() {
        return userInput;
    }

    public void setUserInput(UserInputDto userInput) {
        this.userInput = userInput;
    }

    public List<MaterialCostDto> getMaterialCosts() {
        return materialCosts;
    }

    public void setMaterialCosts(List<MaterialCostDto> materialCosts) {
        this.materialCosts = materialCosts;
    }

    public CostEstimatorDto getCostEstimate() {
        return costEstimate;
    }

    public void setCostEstimate(CostEstimatorDto costEstimate) {
        this.costEstimate = costEstimate;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }
}

