package com.ConstructionCalculator.CostEstimator.Model;

import com.ConstructionCalculator.CostEstimator.Config.CustomDoubleSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "cost_estimates")

public class CostEstimate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long inputId; // ID from the Inputs service
    private Double builtupArea;
    
    @JsonSerialize(using = CustomDoubleSerializer.class)
    private Double totalCost;

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
    public CostEstimate(Long id, Long inputId, Double builtupArea, Double totalCost) {
        this.id = id;
        this.inputId = inputId;
        this.builtupArea = builtupArea;
        this.totalCost = totalCost;
    }
    public CostEstimate() {
    }

    
}
