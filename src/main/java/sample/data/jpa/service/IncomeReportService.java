package sample.data.jpa.service;

import sample.data.jpa.domain.IncomeReport;

import java.util.List;

public interface IncomeReportService {
    List<IncomeReport> getAllIncomeReports();

    IncomeReport getIncomeReportById(Long id);

    IncomeReport insert(IncomeReport incomeReport);

    List<IncomeReport> saveAll(List<IncomeReport> incomeReports);
}
