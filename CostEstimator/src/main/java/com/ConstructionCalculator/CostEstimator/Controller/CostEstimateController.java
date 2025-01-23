package com.ConstructionCalculator.CostEstimator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ConstructionCalculator.CostEstimator.Model.CostEstimate;
import com.ConstructionCalculator.CostEstimator.Service.CostEstimateService;

@RestController
@RequestMapping("/api/cost-estimates")
public class CostEstimateController {

    @Autowired
    private CostEstimateService costEstimateService;

    @GetMapping("/calculate/{inputId}")
    public ResponseEntity<CostEstimate> calculateCost(
            @PathVariable Long inputId) {
        CostEstimate estimate = costEstimateService.calculateCost(inputId);
        return ResponseEntity.ok(estimate);
    }
}
