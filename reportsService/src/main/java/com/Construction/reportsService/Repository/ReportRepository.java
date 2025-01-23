package com.Construction.reportsService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Construction.reportsService.Model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
}

