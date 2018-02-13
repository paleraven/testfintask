package sample.data.jpa.repository;

import org.springframework.data.repository.Repository;
import sample.data.jpa.domain.IncomeReport;

import java.util.List;

public interface IncomeReportRepository extends Repository<IncomeReport, Long> {
    List<IncomeReport> findAll();

    IncomeReport getIncomeReportByReportId(Long id);
}
