package sample.unitTests;

import org.junit.Assert;
import org.junit.Test;
import sample.data.jpa.CustomException.IncorrectDataException;
import sample.data.jpa.domain.IncomeReport;
import sample.data.jpa.service.IncomeReportCountingServiceImpl;

import java.math.BigDecimal;

public class IncomeReportRulesTest {

    @Test
    public void ruleSumof2100() {
        IncomeReport incomeReport = new IncomeReport();
        IncomeReportCountingServiceImpl countingService = new IncomeReportCountingServiceImpl(incomeReport);
        incomeReport.setRow2110(new BigDecimal(14));
        incomeReport.setRow2120(new BigDecimal(12));
        countingService.ruleSumof2100();
        Assert.assertEquals(new BigDecimal(2), incomeReport.getRow2100());
    }

    @Test
    public void ruleSumof2200() {
        IncomeReport incomeReport = new IncomeReport();
        IncomeReportCountingServiceImpl countingService = new IncomeReportCountingServiceImpl(incomeReport);
        incomeReport.setRow2100(new BigDecimal(24));
        incomeReport.setRow2110(new BigDecimal(12));
        countingService.ruleSumof2200();
        Assert.assertEquals(new BigDecimal(12), incomeReport.getRow2200());
    }
    @Test
    public void ruleSumof2300() {
        IncomeReport incomeReport = new IncomeReport();
        IncomeReportCountingServiceImpl countingService = new IncomeReportCountingServiceImpl(incomeReport);
        incomeReport.setRow2200(new BigDecimal(20));
        incomeReport.setRow2310(new BigDecimal(12));
        countingService.ruleSumof2300();
        Assert.assertEquals(new BigDecimal(32), incomeReport.getRow2300());
    }


    @Test
    public void ruleSumof2400() {
        IncomeReport incomeReport = new IncomeReport();
        IncomeReportCountingServiceImpl countingService = new IncomeReportCountingServiceImpl(incomeReport);
        incomeReport.setRow2300(new BigDecimal(20));
        incomeReport.setRow2410(new BigDecimal(12));
        countingService.ruleSumof2400();
        Assert.assertEquals(new BigDecimal(8), incomeReport.getRow2400());
    }

    @Test
    public void ruleMoreThanZero() {
        IncomeReport incomeReport = new IncomeReport();
        IncomeReportCountingServiceImpl countingService = new IncomeReportCountingServiceImpl(incomeReport);
        incomeReport.setRow2110(new BigDecimal(-14));
        try {
            countingService.ruleMoreThanZero();
        } catch (IncorrectDataException e) {
            e.printStackTrace();
        }
    }
}
