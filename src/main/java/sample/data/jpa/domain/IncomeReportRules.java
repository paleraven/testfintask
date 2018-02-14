package sample.data.jpa.domain;

import sample.data.jpa.CustomException.IncorrectDataException;

import java.math.BigDecimal;

public class IncomeReportRules {

    String message = "Row in IncomeReport is null!";

    public boolean ruleSumof2100(BigDecimal row2110, BigDecimal row2120, BigDecimal row2100) throws IncorrectDataException {
        if (row2110 == null || row2120 == null || row2100 == null)
            throw new IncorrectDataException(message);

        BigDecimal result = row2110.subtract(row2120);
        return row2100.equals(result);
    }

    public boolean ruleSumof2200(BigDecimal row2100, BigDecimal row2210, BigDecimal row2220, BigDecimal row2200) throws IncorrectDataException {
        if (row2100 == null || row2210 == null || row2220 == null || row2200 == null)
            throw new IncorrectDataException(message);

        BigDecimal result = row2100.subtract(row2210).subtract(row2220);
        return row2200.equals(result);
    }

    public boolean ruleSumof2300(BigDecimal row2200, BigDecimal row2310, BigDecimal row2320, BigDecimal row2330,
                                 BigDecimal row2340, BigDecimal row2350, BigDecimal row2300) throws IncorrectDataException {
        if (row2200 == null || row2310 == null || row2320 == null || row2330 == null || row2340 == null || row2350 == null)
            throw new IncorrectDataException(message);

        BigDecimal result = row2200.add(row2310).add(row2320).subtract(row2330).add(row2340).subtract(row2350);
        return row2300.equals(result);
    }

    public boolean ruleSumof2400(BigDecimal row2300, BigDecimal row2410, BigDecimal row2430, BigDecimal row2450,
                                 BigDecimal row2460, BigDecimal row2400) throws IncorrectDataException {
        if (row2300 == null || row2410 == null || row2430 == null || row2450 == null || row2460 == null)
            throw new IncorrectDataException(message);

        BigDecimal result = row2300.subtract(row2410).subtract(row2430).add(row2450).subtract(row2460);
        return row2400.equals(result);
    }


}
