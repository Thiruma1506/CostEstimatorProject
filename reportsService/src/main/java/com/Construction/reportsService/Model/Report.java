package com.Construction.reportsService.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId;

    private Long inputId;          // ID of the input data
    private String userName;       // User's name
    private String userEmail;      // User's email
    private Double totalCost;      // Total construction cost
    @Column(columnDefinition = "TEXT")
    private String materialDetails; // Serialized JSON of material costs

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Report() {
    }

    public Report(Date createdAt, Long inputId, String materialDetails, Long reportId, Double totalCost, Date updatedAt, String userEmail, String userName) {
        this.createdAt = createdAt;
        this.inputId = inputId;
        this.materialDetails = materialDetails;
        this.reportId = reportId;
        this.totalCost = totalCost;
        this.updatedAt = updatedAt;
        this.userEmail = userEmail;
        this.userName = userName;
    }

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

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

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public String getMaterialDetails() {
        return materialDetails;
    }

    public void setMaterialDetails(String materialDetails) {
        this.materialDetails = materialDetails;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
