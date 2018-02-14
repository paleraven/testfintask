package sample.data.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import sample.data.jpa.domain.IncomeReport;

import java.util.List;

public interface IncomeReportRepository extends CrudRepository<IncomeReport, Long> {
    List<IncomeReport> findAll();

    IncomeReport getIncomeReportByReportId(Long id);

    IncomeReport save(IncomeReport incomeReport);

    List<IncomeReport> save(List<IncomeReport> incomeReports);
}
