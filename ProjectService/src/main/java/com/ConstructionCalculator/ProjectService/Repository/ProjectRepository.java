package com.ConstructionCalculator.ProjectService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ConstructionCalculator.ProjectService.Model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
