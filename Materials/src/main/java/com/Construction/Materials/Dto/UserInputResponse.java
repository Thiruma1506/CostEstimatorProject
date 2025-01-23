package com.Construction.Materials.Dto;

public class UserInputResponse{
    private Long inputId;
    private String materialQuality;

    // Getters and Setters
    public Long getInputId() {
        return inputId;
    }

    public void setInputId(Long inputId) {
        this.inputId = inputId;
    }

    public String getMaterialQuality() {
        return materialQuality;
    }

    public void setMaterialQuality(String materialQuality) {
        this.materialQuality = materialQuality;
    }
}