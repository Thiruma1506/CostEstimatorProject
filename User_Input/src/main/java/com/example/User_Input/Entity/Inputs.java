package com.example.User_Input.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inputs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inputs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
