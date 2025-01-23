package com.Construction.reportsService.Dto;

public class MaterialCostDto {
    private Long materialId;
    private Long inputId;     
    private String resourceName;
    private String resourceQuantity;
    private String materialQuality; // Basic, Premium, Ultra Premium
    private Double amount;

    public MaterialCostDto(Long materialId, Long inputId, String resourceName, String resourceQuantity,
            String materialQuality, Double amount) {
        this.materialId = materialId;
        this.inputId = inputId;
        this.resourceName = resourceName;
        this.resourceQuantity = resourceQuantity;
        this.materialQuality = materialQuality;
        this.amount = amount;
    }

    public MaterialCostDto() {
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public Long getInputId() {
        return inputId;
    }

    public void setInputId(Long inputId) {
        this.inputId = inputId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceQuantity() {
        return resourceQuantity;
    }

    public void setResourceQuantity(String resourceQuantity) {
        this.resourceQuantity = resourceQuantity;
    }

    public String getMaterialQuality() {
        return materialQuality;
    }

    public void setMaterialQuality(String materialQuality) {
        this.materialQuality = materialQuality;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
