package com.example.User_Input.Dto;

import java.time.LocalDateTime;

public class ResponseDto {

    private Long inputId;
    private String userName;
    private String userEmail;
    private Double builtupArea; // Fetched from InputDto
    private Long constructionId;
    private Double totalEstimate; // Fetched from CostEstimatorDto
    private LocalDateTime generatedAt;

    // Constructors
    public ResponseDto() {
    }

    public ResponseDto(Long inputId, String userName, String userEmail, Double builtupArea, 
                       Long constructionId, Double totalEstimate, LocalDateTime generatedAt) {
        this.inputId = inputId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.builtupArea = builtupArea;
        this.constructionId = constructionId;
        this.totalEstimate = totalEstimate;
        this.generatedAt = generatedAt;
    }

    // Getters and Setters
    public Long getInputId() {
        return inputId;
    }

    public void setInputId(Long inputId) {
        this.inputId = inputId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Double getBuiltupArea() {
        return builtupArea;
    }

    public void setBuiltupArea(Double builtupArea) {
        this.builtupArea = builtupArea;
    }

    public Long getConstructionId() {
        return constructionId;
    }

    public void setConstructionId(Long constructionId) {
        this.constructionId = constructionId;
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

