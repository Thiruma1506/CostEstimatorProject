package com.example.User_Input.Dto;

public class InputDto {
    private Long id;
    private Double builtupArea;

    public InputDto(Long id, Double builtupArea) {
        this.id = id;
        this.builtupArea = builtupArea;
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
    public InputDto() {
    }
    
}