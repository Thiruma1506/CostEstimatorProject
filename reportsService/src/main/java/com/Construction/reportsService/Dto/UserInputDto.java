package com.Construction.reportsService.Dto;

public class UserInputDto {
    private Long id;
    private Double builtupArea;
    private Long phoneNumber;
    private String userEmail;
    private String userName;
    private String city;
    private String state;
    private String constructionType;
    private int totalFloor;
    private String propName;
    private Boolean landclearence;
    private String materialQuality;

    public UserInputDto() {
    }

    public UserInputDto(Double builtupArea, String city, String constructionType, Long id, Boolean landclearence, String materialQuality, Long phoneNumber, String propName, String state, int totalFloor, String userEmail, String userName) {
        this.builtupArea = builtupArea;
        this.city = city;
        this.constructionType = constructionType;
        this.id = id;
        this.landclearence = landclearence;
        this.materialQuality = materialQuality;
        this.phoneNumber = phoneNumber;
        this.propName = propName;
        this.state = state;
        this.totalFloor = totalFloor;
        this.userEmail = userEmail;
        this.userName = userName;
    }

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

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public Boolean getLandclearence() {
        return landclearence;
    }

    public void setLandclearence(Boolean landclearence) {
        this.landclearence = landclearence;
    }

    public String getMaterialQuality() {
        return materialQuality;
    }

    public void setMaterialQuality(String materialQuality) {
        this.materialQuality = materialQuality;
    }
}
