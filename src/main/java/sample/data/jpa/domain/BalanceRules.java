package sample.data.jpa.domain;

import sample.data.jpa.CustomException.IncorrectDataException;

import java.math.BigDecimal;

public class BalanceRules {

    private String message = "Row in Balance is null!";

    public boolean ruleSumof1100(BigDecimal sumOfFixedAssetsBalance, BigDecimal row1100) throws IncorrectDataException {
        if (row1100 == null)
            throw new IncorrectDataException(message);

        return sumOfFixedAssetsBalance.equals(row1100);
    }

    public boolean ruleSumOf1200(BigDecimal sumOfCurrentAssetsBalance, BigDecimal row1200) throws IncorrectDataException {
        if (row1200 == null)
            throw new IncorrectDataException(message);

        return sumOfCurrentAssetsBalance.equals(row1200);
    }

    public boolean ruleSumOf1600eq1100plus1200(BigDecimal row1100, BigDecimal row1200, BigDecimal row1600) throws IncorrectDataException {
        if (row1100 == null || row1200 == null || row1600 == null)
            throw new IncorrectDataException(message);

        BigDecimal result = row1100.add(row1200);
        return result.equals(row1600);
    }

    public boolean ruleSumOf1600eq1700(BigDecimal row1600, BigDecimal row1700) throws IncorrectDataException {
        if (row1600 == null || row1700 == null)
            throw new IncorrectDataException(message);

        return row1600.equals(row1700);
    }

    public boolean ruleSumOf1300(BigDecimal sumOfCapitalAndReservesBalance, BigDecimal row1300) throws IncorrectDataException {
        if (row1300 == null)
            throw new IncorrectDataException(message);

        return sumOfCapitalAndReservesBalance.equals(row1300);
    }

    public boolean ruleSumOf1400(BigDecimal sumOfLongTermDutiesBalance, BigDecimal row1400) throws IncorrectDataException {
        if (row1400 == null)
            throw new IncorrectDataException(message);

        return sumOfLongTermDutiesBalance.equals(row1400);
    }

    public boolean ruleSumOf1500(BigDecimal sumOfShortTermDutiesBalance, BigDecimal row1500) throws IncorrectDataException {
        if (row1500 == null)
            throw new IncorrectDataException(message);

        return sumOfShortTermDutiesBalance.equals(row1500);
    }

    public boolean ruleSumOf1700(BigDecimal sumBalance, BigDecimal row1700) throws IncorrectDataException {
        if (sumBalance == null || row1700 == null)
            throw new IncorrectDataException(message);

        return sumBalance.equals(row1700);
    }

}
