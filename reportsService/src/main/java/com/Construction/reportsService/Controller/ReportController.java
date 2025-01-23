package com.Construction.reportsService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Construction.reportsService.Dto.ReportResponseDto;
import com.Construction.reportsService.Service.ReportService;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/{inputId}")
    public ResponseEntity<ReportResponseDto> generateReport(@PathVariable Long inputId) {
        return ResponseEntity.ok(reportService.generateReport(inputId));
    }
}

