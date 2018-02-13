package sample.data.jpa.domain;

import java.math.BigDecimal;

public class BalanceRules {

    public boolean ruleSumof1100(BigDecimal sumOfFixedAssetsBalance, BigDecimal row1100) {
        return sumOfFixedAssetsBalance.equals(row1100);
    }

    public boolean ruleSumOf1200(BigDecimal sumOfCurrentAssetsBalance, BigDecimal row1200) {
        return sumOfCurrentAssetsBalance.equals(row1200);
    }

    public boolean ruleSumOf1600eq1100plus1200(BigDecimal row1100, BigDecimal row1200, BigDecimal row1600) {
        BigDecimal result = row1100.add(row1200);
        return result.equals(row1600);
    }

    public boolean ruleSumOf1600eq1700(BigDecimal row1600, BigDecimal row1700) {
        return row1600.equals(row1700);
    }

    public boolean ruleSumOf1300(BigDecimal sumOfCapitalAndReservesBalance, BigDecimal row1300) {
        return sumOfCapitalAndReservesBalance.equals(row1300);
    }

    public boolean ruleSumOf1400(BigDecimal sumOfLongTermDutiesBalance, BigDecimal row1400) {
        return sumOfLongTermDutiesBalance.equals(row1400);
    }

    public boolean ruleSumOf1500(BigDecimal sumOfShortTermDutiesBalance, BigDecimal row1500) {
        return sumOfShortTermDutiesBalance.equals(row1500);
    }

    public boolean ruleSumOf1700(BigDecimal sumBalance, BigDecimal row1700) {
        return sumBalance.equals(row1700);
    }

}
