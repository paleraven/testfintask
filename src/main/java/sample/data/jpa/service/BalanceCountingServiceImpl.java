package sample.data.jpa.service;

import sample.data.jpa.CustomException.IncorrectDataException;
import sample.data.jpa.domain.Balance;

import java.math.BigDecimal;

import sample.data.jpa.util.Utils;

public class BalanceCountingServiceImpl implements BalanceCountingService {

    private String message = "Data inconsistency";

    private Balance balance;

    public BalanceCountingServiceImpl(Balance balance) {
        this.balance = balance;
    }

    public void ruleSumof1100() {
        BigDecimal result = Utils.notNull(balance.getRow1110()).add(Utils.notNull(balance.getRow1120())).add(Utils.notNull(balance.getRow1130())).add(Utils.notNull(balance.getRow1140()))
                .add(Utils.notNull(balance.getRow1150())).add(Utils.notNull(balance.getRow1160())).add(Utils.notNull(balance.getRow1170())).add(Utils.notNull(balance.getRow1180()))
                .add(Utils.notNull(balance.getRow1190()));
        balance.setRow1100(result);
    }

    public void ruleSumof1200() {
        BigDecimal result = Utils.notNull(balance.getRow1210()).add(Utils.notNull(balance.getRow1220())).add(Utils.notNull(balance.getRow1230())).add(Utils.notNull(balance.getRow1240()))
                .add(Utils.notNull(balance.getRow1250())).add(Utils.notNull(balance.getRow1260()));
        balance.setRow1200(result);
    }

    public void ruleSumof1300() {
        BigDecimal result = Utils.notNull(balance.getRow1310()).subtract(Utils.notNull(balance.getRow1320())).add(Utils.notNull(balance.getRow1340()))
                .add(Utils.notNull(balance.getRow1350())).add(Utils.notNull(balance.getRow1360())).add(Utils.notNull(balance.getRow1370()));
        balance.setRow1300(result);
    }

    public void ruleSumof1400() {
        BigDecimal result = Utils.notNull(balance.getRow1410()).add(Utils.notNull(balance.getRow1420())).add(Utils.notNull(balance.getRow1430()))
                .add(Utils.notNull(balance.getRow1450()));
        balance.setRow1400(result);
    }

    public void ruleSumof1500() {
        BigDecimal result = Utils.notNull(balance.getRow1510()).add(Utils.notNull(balance.getRow1520())).add(Utils.notNull(balance.getRow1530())).add(Utils.notNull(balance.getRow1540()))
                .add(Utils.notNull(balance.getRow1550()));
        balance.setRow1500(result);
    }

    public void ruleSumof1600() {
        BigDecimal result = Utils.notNull(balance.getRow1100()).add(Utils.notNull(balance.getRow1200()));
        balance.setRow1600(result);
    }

    public void ruleSumof1700() {
        BigDecimal result = Utils.notNull(balance.getRow1300()).add(Utils.notNull(balance.getRow1400())).add(Utils.notNull(balance.getRow1500()));
        balance.setRow1700(result);
    }

    public void ruleSumof1600or1700() throws IncorrectDataException {
        if (!Utils.notNull(balance.getRow1600()).equals(Utils.notNull(balance.getRow1700())))
            throw new IncorrectDataException(message);
    }

    public void ruleMoreThanZero() throws IncorrectDataException
    {
        moreThanZero(balance.getRow1110());
        moreThanZero(balance.getRow1120());
        moreThanZero(balance.getRow1130());
        moreThanZero(balance.getRow1140());
        moreThanZero(balance.getRow1150());
        moreThanZero(balance.getRow1160());
        moreThanZero(balance.getRow1170());

        moreThanZero(balance.getRow1190());

        moreThanZero(balance.getRow1200());
        moreThanZero(balance.getRow1210());
        moreThanZero(balance.getRow1230());
        moreThanZero(balance.getRow1240());
        moreThanZero(balance.getRow1250());
        moreThanZero(balance.getRow1260());


        moreThanZero(balance.getRow1310());
        moreThanZero(balance.getRow1340());
        moreThanZero(balance.getRow1350());
        moreThanZero(balance.getRow1360());

        moreThanZero(balance.getRow1400());
        moreThanZero(balance.getRow1410());
        moreThanZero(balance.getRow1430());
        moreThanZero(balance.getRow1450());

        moreThanZero(balance.getRow1500());
        moreThanZero(balance.getRow1510());
        moreThanZero(balance.getRow1520());
        moreThanZero(balance.getRow1530());
        moreThanZero(balance.getRow1540());
        moreThanZero(balance.getRow1550());
        moreThanZero(balance.getRow1600());

        moreThanZero(balance.getRow1700());
    }

    private void moreThanZero(BigDecimal row) throws IncorrectDataException
    {
        if(Utils.notNull(row).signum() < 0)
            throw new IncorrectDataException("Row can not be less then zero" );

    }

}
