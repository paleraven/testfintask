package sample.data.jpa.service;

import sample.data.jpa.CustomException.IncorrectDataException;
import sample.data.jpa.domain.Balance;

import java.math.BigDecimal;

public class CountingServiceImpl extends Balance implements CountingService {

    private String message = "Data inconsistency";

    private Balance balance;
    private CountingServiceImpl countingService;

    public CountingServiceImpl(Balance balance) {
        this.balance = balance;
    }

//    @Override
//    public BigDecimal getRow1110() {
//
//        if (super.getRow1110() == null)
//            return BigDecimal.ZERO;
//        else return super.getRow1110();
//    }
//
//    @Override
//    public BigDecimal getRow1120() {
//
//        if (super.getRow1120() == null)
//            return BigDecimal.ZERO;
//        else return super.getRow1120();
//    }


//    public void overr() {
//        countingService = new CountingServiceImpl(balance);
//        BigDecimal result =
//                countingService.getRow1110()
//                        .add(countingService.getRow1120());
//        balance.setRow1100(result);
//    }

    public void ruleSumof1100() {
        BigDecimal result = balance.getRow1110().add(balance.getRow1120()).add(balance.getRow1130().add(balance.getRow1140()
                .add(balance.getRow1150().add(balance.getRow1160().add(balance.getRow1170()).add(balance.getRow1180()
                        .add(balance.getRow1190()))))));
        balance.setRow1100(result);
    }

    public void ruleSumof1200() {
        BigDecimal result = balance.getRow1210().add(balance.getRow1220()).add(balance.getRow1230().add(balance.getRow1240()
                .add(balance.getRow1250().add(balance.getRow1260()))));
        balance.setRow1200(result);
    }

    public void ruleSumof1300() {
        BigDecimal result = balance.getRow1310().subtract(balance.getRow1320()).add(balance.getRow1340()
                .add(balance.getRow1350().add(balance.getRow1360().add(balance.getRow1370()))));
        balance.setRow1300(result);
    }

    public void ruleSumof1400() {
        BigDecimal result = balance.getRow1410().add(balance.getRow1420()).add(balance.getRow1430()
                .add(balance.getRow1450()));
        balance.setRow1400(result);
    }

    public void ruleSumof1500() {
        BigDecimal result = balance.getRow1510().add(balance.getRow1520()).add(balance.getRow1530().add(balance.getRow1540()
                .add(balance.getRow1550())));
        balance.setRow1500(result);
    }

    public void ruleSumof1600() {
        BigDecimal result = balance.getRow1100().add(balance.getRow1200());
        balance.setRow1600(result);
    }

    public void ruleSumof1700() {
        BigDecimal result = balance.getRow1300().add(balance.getRow1400()).add(balance.getRow1500());
        balance.setRow1700(result);
    }

    public void ruleSumof1600_1700() throws IncorrectDataException {
        if (balance.getRow1600() != balance.getRow1700())
            throw new IncorrectDataException(message);
    }

    public void rule1110() throws IncorrectDataException {
        if (balance.getRow1110().signum() < 0)
            throw new IncorrectDataException(message);

    }




}
