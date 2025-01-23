package com.ConstructionCalculator.CostEstimator.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ConstructionCalculator.CostEstimator.Model.CostEstimate;

@Repository
public interface CostEstimateRepository extends JpaRepository<CostEstimate, Long> {

    Optional<CostEstimate> findByInputId(Long inputId);
    
}
