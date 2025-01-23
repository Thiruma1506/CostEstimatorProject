package com.Construction.Materials.Dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class CostEstimateDto {

    private Long id;
    private Long inputId; // ID from the Inputs service
    private Double builtupArea;

    @JsonSerialize(using = CustomDoubleSerializer.class)
    private Double totalCost;

    // Constructor
    public CostEstimateDto(Long id, Long inputId, Double builtupArea, Double totalCost) {
        this.id = id;
        this.inputId = inputId;
        this.builtupArea = builtupArea;
        this.totalCost = totalCost;
    }

    // Default constructor
    public CostEstimateDto() {
    }

    // Getters and Setters
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
