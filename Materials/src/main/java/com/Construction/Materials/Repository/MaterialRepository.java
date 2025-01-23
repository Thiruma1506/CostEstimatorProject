package com.Construction.Materials.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Construction.Materials.Model.MaterialEstimator;

@Repository
public interface MaterialRepository extends JpaRepository<MaterialEstimator,Long> {
    
}
