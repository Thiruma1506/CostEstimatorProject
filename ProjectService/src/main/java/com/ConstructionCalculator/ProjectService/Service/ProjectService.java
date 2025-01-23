package com.ConstructionCalculator.ProjectService.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ConstructionCalculator.ProjectService.Model.Project;
import com.ConstructionCalculator.ProjectService.Repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    // Create a new Project
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    // Get Project by ID
    public Optional<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    // Update an existing Project
    public Optional<Project> updateProject(Long id, Project projectDetails) {
        return projectRepository.findById(id).map(existingProject -> {
            existingProject.setUserId(projectDetails.getUserId());
            existingProject.setProjectType(projectDetails.getProjectType());
            existingProject.setLocation(projectDetails.getLocation());
            existingProject.setProjectDimensions(projectDetails.getProjectDimensions());
            existingProject.setStartDate(projectDetails.getStartDate());
            existingProject.setEndDate(projectDetails.getEndDate());
            existingProject.setTotalCost(projectDetails.getTotalCost());
            existingProject.setUpdatedAt(new java.util.Date());
            return projectRepository.save(existingProject);
        });
    }

    // Delete a Project
    public boolean deleteProject(Long id) {
        if (projectRepository.existsById(id)) {
            projectRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // Get all Projects
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
}

