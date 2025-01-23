package com.example.User_Input.Dto;

import java.time.LocalDateTime;


public class CostEstimatorDto {
    
    
    private Long constructionId;
    private Integer projectId;
    private Integer constructorId;
    private Double totalEstimate;
    private LocalDateTime generatedAt;

    public CostEstimatorDto(Long constructionId, Integer projectId, Integer constructorId, Double totalEstimate,
            LocalDateTime generatedAt) {
        this.constructionId = constructionId;
        this.projectId = projectId;
        this.constructorId = constructorId;
        this.totalEstimate = totalEstimate;
        this.generatedAt = generatedAt;
    }
    public CostEstimatorDto() {
    }
    
    public Long getConstructionId() {
        return constructionId;
    }
    public void setConstructionId(Long constructionId) {
        this.constructionId = constructionId;
    }
    public Integer getProjectId() {
        return projectId;
    }
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
    public Integer getConstructorId() {
        return constructorId;
    }
    public void setConstructorId(Integer constructorId) {
        this.constructorId = constructorId;
    }
    public Double getTotalEstimate() {
        return totalEstimate;
    }
    public void setTotalEstimate(Double totalEstimate) {
        this.totalEstimate = totalEstimate;
    }
    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }
    public void setGeneratedAt(LocalDateTime generatedAt) {
        this.generatedAt = generatedAt;
    }

}
