package com.pickshell.mock.service

import com.pickshell.mock.domain.ReportEntity;

/**
* Interface for generating reports.
*/
public interface IReportGenerator {
/**
* Generate report.
* @param report Report entity.
*/
void generateReport(ReportEntity report);
}