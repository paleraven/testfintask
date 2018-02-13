package sample.data.jpa.domain;

import java.math.BigDecimal;

public class BalanceUtils {

    public BigDecimal sumOfFixedAssetsBalance_1100(BigDecimal row1110, BigDecimal row1120, BigDecimal row1130,
                                                    BigDecimal row1140, BigDecimal row1150, BigDecimal row1160,
                                                    BigDecimal row1170, BigDecimal row1180, BigDecimal row1190) {
        BigDecimal result = row1110.add(row1120).add(row1130).add(row1140).add(row1150).add(row1160)
                .add(row1170).add(row1180).add(row1190);
        return result;
    }

    public BigDecimal sumOfCurrentAssetsBalance_1200(BigDecimal row1210, BigDecimal row1220, BigDecimal row1230,
                                                      BigDecimal row1240, BigDecimal row1250, BigDecimal row1260) {
        BigDecimal result = row1210.add(row1220).add(row1230).add(row1240).add(row1250).add(row1260);
        return result;

    }

    public BigDecimal sumOfCapitalAndReservesBalance_1300(BigDecimal row1310, BigDecimal row1320, BigDecimal row1330,
                                                           BigDecimal row1340, BigDecimal row1350, BigDecimal row1360,
                                                           BigDecimal row1370) {
        BigDecimal result = row1310.add(row1320).add(row1330).add(row1340).add(row1350).add(row1360)
                .add(row1370);
        return result;

    }


    public BigDecimal sumOfLongTermDutiesBalance_1400(BigDecimal row1410, BigDecimal row1420, BigDecimal row1430,
                                                       BigDecimal row1440, BigDecimal row1450) {
        BigDecimal result = row1410.add(row1420).add(row1430).add(row1440).add(row1450);
        return result;

    }

    public BigDecimal sumOfShortTermDutiesBalance_1500(BigDecimal row1510, BigDecimal row1520, BigDecimal row1530,
                                                       BigDecimal row1540, BigDecimal row1550) {
        BigDecimal result = row1510.add(row1520).add(row1530).add(row1540).add(row1550);
        return result;

    }

    public BigDecimal sumBalance_1700(BigDecimal row1300, BigDecimal row1400, BigDecimal row1500) {
        BigDecimal result = row1300.add(row1400).add(row1500);
        return result;

    }
}
