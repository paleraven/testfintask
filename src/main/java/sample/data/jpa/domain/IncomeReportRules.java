package sample.data.jpa.domain;

import java.math.BigDecimal;

public class IncomeReportRules {

    public boolean ruleSumof2100(BigDecimal row2110, BigDecimal row2120, BigDecimal row2100) {
        BigDecimal result = row2110.subtract(row2120);
        return row2100.equals(result);
    }

    public boolean ruleSumof2200(BigDecimal row2100, BigDecimal row2210, BigDecimal row2220, BigDecimal row2200) {
        BigDecimal result = row2100.subtract(row2210).subtract(row2220);
        return row2200.equals(result);
    }

    public boolean ruleSumof2300(BigDecimal row2200, BigDecimal row2310, BigDecimal row2320, BigDecimal row2330,
                                 BigDecimal row2340, BigDecimal row2350, BigDecimal row2300) {
        BigDecimal result = row2200.add(row2310).add(row2320).subtract(row2330).add(row2340).subtract(row2350);
        return row2300.equals(result);
    }

    public boolean ruleSumof2400(BigDecimal row2300, BigDecimal row2410, BigDecimal row2430, BigDecimal row2450,
                                 BigDecimal row2460, BigDecimal row2400) {
        BigDecimal result = row2300.subtract(row2410).subtract(row2430).add(row2450).subtract(row2460);
        return row2400.equals(result);
    }

    public boolean ruleSumof2500(BigDecimal row2400, BigDecimal row2510, BigDecimal row2520, BigDecimal row2500) {
        BigDecimal result = row2400.add(row2510).add(row2520);
        return row2500.equals(result);
    }
//TODO
}
