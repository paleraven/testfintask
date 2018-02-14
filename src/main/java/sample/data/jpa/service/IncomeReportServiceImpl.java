package sample.data.jpa.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sample.data.jpa.domain.IncomeReport;
import sample.data.jpa.repository.IncomeReportRepository;

import java.util.List;

@Component("incomeReportService")
@Transactional
public class IncomeReportServiceImpl implements IncomeReportService {

    private IncomeReportRepository incomeReportRepository;

    public IncomeReportServiceImpl(IncomeReportRepository incomeReportRepository) {
        this.incomeReportRepository = incomeReportRepository;
    }

    @Override
    public List<IncomeReport> getAllIncomeReports() {
        return incomeReportRepository.findAll();
    }

    @Override
    public IncomeReport getIncomeReportById(Long id) {
        return incomeReportRepository.getIncomeReportByReportId(id);
    }

    @Override
    public IncomeReport insert(IncomeReport incomeReport) {
        return incomeReportRepository.save(incomeReport);
    }

    @Override
    public List<IncomeReport> saveAll(List<IncomeReport> incomeReports) {
        return incomeReportRepository.save(incomeReports);
    }
}
