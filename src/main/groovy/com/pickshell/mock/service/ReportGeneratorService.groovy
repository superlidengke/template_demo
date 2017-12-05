package com.pickshell.mock.service

import com.pickshell.mock.domain.ReportEntity

/**
 * Created by uc212310 on 12/5/2017.
 */
class ReportGeneratorService {
    private IReportGenerator reportGenerator;
/**
 * Generate report.
 * @param startDate start date
 * @param endDate end date
 * @param content report content
 */
    public void generateReport(Date startDate, Date endDate, byte[] content) {
        ReportEntity report = new ReportEntity();
        report.setContent(content);
        report.setStartDate(startDate);
        report.setEndDate(endDate);
        reportGenerator.generateReport(report);
    }
}
