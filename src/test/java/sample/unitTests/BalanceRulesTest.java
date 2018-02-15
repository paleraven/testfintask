package sample.unitTests;

import org.junit.Assert;
import org.junit.Test;
import sample.data.jpa.CustomException.IncorrectDataException;
import sample.data.jpa.domain.Balance;
import sample.data.jpa.service.BalanceCountingServiceImpl;

import java.math.BigDecimal;

public class BalanceRulesTest {

    @Test
    public void ruleSumof1100() {
        Balance balance = new Balance();
        BalanceCountingServiceImpl countingService = new BalanceCountingServiceImpl(balance);
        balance.setRow1110(null);
        balance.setRow1120(new BigDecimal(12));
        countingService.ruleSumof1100();
        Assert.assertEquals(new BigDecimal(12), balance.getRow1100());
    }

    @Test
    public void ruleSumof1200() {
        Balance balance = new Balance();
        BalanceCountingServiceImpl countingService = new BalanceCountingServiceImpl(balance);
        balance.setRow1210(new BigDecimal(14));
        balance.setRow1220(new BigDecimal(12));
        countingService.ruleSumof1200();
        Assert.assertEquals(new BigDecimal(26), balance.getRow1200());
    }

    @Test
    public void ruleSumof1300() {
        Balance balance = new Balance();
        BalanceCountingServiceImpl countingService = new BalanceCountingServiceImpl(balance);
        balance.setRow1310(new BigDecimal(14));
        balance.setRow1320(new BigDecimal(12));
        countingService.ruleSumof1300();
        Assert.assertEquals(new BigDecimal(2), balance.getRow1300());
    }

    @Test
    public void ruleSumof1400() {
        Balance balance = new Balance();
        BalanceCountingServiceImpl countingService = new BalanceCountingServiceImpl(balance);
        balance.setRow1410(new BigDecimal(14));
        balance.setRow1420(new BigDecimal(12));
        countingService.ruleSumof1400();
        Assert.assertEquals(new BigDecimal(26), balance.getRow1400());
    }

    @Test
    public void ruleSumof1500() {
        Balance balance = new Balance();
        BalanceCountingServiceImpl countingService = new BalanceCountingServiceImpl(balance);
        balance.setRow1510(new BigDecimal(14));
        balance.setRow1520(new BigDecimal(12));
        countingService.ruleSumof1500();
        Assert.assertEquals(new BigDecimal(26), balance.getRow1500());
    }

    @Test
    public void ruleSumof1600() {
        Balance balance = new Balance();
        BalanceCountingServiceImpl countingService = new BalanceCountingServiceImpl(balance);
        balance.setRow1100(new BigDecimal(14));
        balance.setRow1200(new BigDecimal(12));
        countingService.ruleSumof1600();
        Assert.assertEquals(new BigDecimal(26), balance.getRow1600());
    }

    @Test
    public void ruleSumof1700() {
        Balance balance = new Balance();
        BalanceCountingServiceImpl countingService = new BalanceCountingServiceImpl(balance);
        balance.setRow1300(new BigDecimal(14));
        balance.setRow1400(new BigDecimal(12));
        countingService.ruleSumof1700();
        Assert.assertEquals(new BigDecimal(26), balance.getRow1700());
    }

    @Test
    public void ruleSumof1600_1700() {
        Balance balance = new Balance();
        BalanceCountingServiceImpl countingService = new BalanceCountingServiceImpl(balance);
        balance.setRow1600(new BigDecimal(14));
        balance.setRow1700(new BigDecimal(12));
        try {
            countingService.ruleSumof1600_1700();
        } catch (IncorrectDataException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ruleMoreThanZero() {
        Balance balance = new Balance();
        BalanceCountingServiceImpl countingService = new BalanceCountingServiceImpl(balance);
        balance.setRow1110(new BigDecimal(-14));
        try {
            countingService.ruleMoreThanZero();
        } catch (IncorrectDataException e) {
            e.printStackTrace();
        }
    }

}
