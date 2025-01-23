package com.Construction.reportsService.Dto;

import com.Construction.reportsService.Config.CustomDoubleSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class CostEstimatorDto {
    
    private Long id;
    private Long inputId; // ID from the Inputs service
    private Double builtupArea;
    
    @JsonSerialize(using = CustomDoubleSerializer.class)
    private Double totalCost;

    public CostEstimatorDto() {
    }

    public CostEstimatorDto(Double builtupArea, Long id, Long inputId, Double totalCost) {
        this.builtupArea = builtupArea;
        this.id = id;
        this.inputId = inputId;
        this.totalCost = totalCost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInputId() {
        return inputId;
    }

    public void setInputId(Long inputId) {
        this.inputId = inputId;
    }

    public Double getBuiltupArea() {
        return builtupArea;
    }

    public void setBuiltupArea(Double builtupArea) {
        this.builtupArea = builtupArea;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

}
