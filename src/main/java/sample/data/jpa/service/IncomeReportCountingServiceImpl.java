package sample.data.jpa.service;

import sample.data.jpa.CustomException.IncorrectDataException;
import sample.data.jpa.domain.IncomeReport;
import sample.data.jpa.util.Utils;

import java.math.BigDecimal;

public class IncomeReportCountingServiceImpl implements IncomeReportCountingService {

    private IncomeReport incomeReport;

    public IncomeReportCountingServiceImpl(IncomeReport incomeReport) {
        this.incomeReport = incomeReport;
    }

    public void ruleSumof2100() {
        BigDecimal result = Utils.notNull(incomeReport.getRow2110()).subtract(Utils.notNull(incomeReport.getRow2120()));
        incomeReport.setRow2100(result);
    }

    public void ruleSumof2200() {
        BigDecimal result = Utils.notNull(incomeReport.getRow2100()).subtract(Utils.notNull(incomeReport.getRow2110()))
                .subtract(Utils.notNull(incomeReport.getRow2220()));
        incomeReport.setRow2200(result);
    }

    public void ruleSumof2300() {
        BigDecimal result = Utils.notNull(incomeReport.getRow2200()).add(Utils.notNull(incomeReport.getRow2310()))
                .add(Utils.notNull(incomeReport.getRow2320())).subtract(Utils.notNull(incomeReport.getRow2330()))
                .add((Utils.notNull(incomeReport.getRow2340()))).subtract((Utils.notNull(incomeReport.getRow2350())));
        incomeReport.setRow2300(result);
    }

    public void ruleSumof2400() {
        BigDecimal result = Utils.notNull(incomeReport.getRow2300()).subtract(Utils.notNull(incomeReport.getRow2410()))
                .subtract(Utils.notNull(incomeReport.getRow2430())).add(Utils.notNull(incomeReport.getRow2450()))
                .subtract((Utils.notNull(incomeReport.getRow2460())));
        incomeReport.setRow2400(result);
    }

    public void ruleMoreThanZero() throws IncorrectDataException {
        moreThanZero(incomeReport.getRow2110());
        moreThanZero(incomeReport.getRow2120());

        moreThanZero(incomeReport.getRow2210());
        moreThanZero(incomeReport.getRow2220());

        moreThanZero(incomeReport.getRow2310());
        moreThanZero(incomeReport.getRow2320());
        moreThanZero(incomeReport.getRow2330());
        moreThanZero(incomeReport.getRow2340());
        moreThanZero(incomeReport.getRow2350());
        moreThanZero(incomeReport.getRow2410());
    }

    private void moreThanZero(BigDecimal row) throws IncorrectDataException {
        if (Utils.notNull(row).signum() < 0)
            throw new IncorrectDataException("Row can not be less then zero");
    }

}
