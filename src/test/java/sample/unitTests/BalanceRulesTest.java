package sample.unitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sample.data.jpa.CustomException.IncorrectDataException;
import sample.data.jpa.domain.IncomeReportRules;

import java.math.BigDecimal;

public class BalanceRulesTest {

    IncomeReportRules incomeReportRules = new IncomeReportRules();

    @Test
    public void ruleSumof2100Test() throws IncorrectDataException {

        Assert.assertTrue(incomeReportRules.ruleSumof2100(new BigDecimal(24), new BigDecimal(12),
                new BigDecimal(12)));
    }

    @Test
    public void ruleSumof2100TestNull() {
        try {
            Assert.assertFalse(incomeReportRules.ruleSumof2100(new BigDecimal(24), new BigDecimal(12),
                    null));
        } catch (IncorrectDataException e) {
            e.printStackTrace();
        }
    }

}
