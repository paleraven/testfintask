package sample.unitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sample.data.jpa.CustomException.IncorrectDataException;
import sample.data.jpa.domain.Balance;
import sample.data.jpa.domain.IncomeReportRules;
import sample.data.jpa.service.CountingServiceImpl;

import java.math.BigDecimal;

public class BalanceRulesTest {

    IncomeReportRules incomeReportRules = new IncomeReportRules();

    @Test
    public void ruleSumof1100() {

        Balance balance = new Balance();
        CountingServiceImpl countingService = new CountingServiceImpl(balance);
        countingService.setRow1110(null);
        countingService.setRow1120(new BigDecimal(12));

//        countingService.overr();
        Assert.assertEquals(balance.getRow1100(), new BigDecimal(24));
    }

    @Test
    public void ruleSumof1100Null() {

        Balance balance = new Balance();
//        balance.setRow1110(new BigDecimal(13));
        balance.setRow1120(new BigDecimal(12));
        CountingServiceImpl countingService = new CountingServiceImpl(balance);
        countingService.ruleSumof1100();
        Assert.assertEquals(balance.getRow1100(), new BigDecimal(24));
    }

}
