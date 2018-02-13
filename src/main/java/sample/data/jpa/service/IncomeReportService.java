package sample.data.jpa.service;

import sample.data.jpa.domain.IncomeReport;

import java.util.List;

public interface IncomeReportService {
    List<IncomeReport> getAllIncomeReports();

    IncomeReport getIncomeReportByAccountId(Long id);
}
