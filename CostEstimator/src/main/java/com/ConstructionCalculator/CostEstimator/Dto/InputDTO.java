package com.ConstructionCalculator.CostEstimator.Dto;


public class InputDTO {
    private Long id;
    private Double builtupArea;
    private String constructionType;
    private int totalFloor; // Add this field

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBuiltupArea() {
        return builtupArea;
    }

    public void setBuiltupArea(Double builtupArea) {
        this.builtupArea = builtupArea;
    }

    public String getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(String constructionType) {
        this.constructionType = constructionType;
    }

    public int getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(int totalFloor) {
        this.totalFloor = totalFloor;
    }

    public InputDTO(Long id, Double builtupArea, String constructionType, int totalFloor) {
        this.id = id;
        this.builtupArea = builtupArea;
        this.constructionType = constructionType;
        this.totalFloor = totalFloor;
    }

    public InputDTO() {
    }


}
