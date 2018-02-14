package sample.data.jpa.domain;

import sample.data.jpa.CustomException.IncorrectDataException;

import java.math.BigDecimal;

public class BalanceUtils {

    String message = "Row in Balance is null!";

    public BigDecimal sumOfFixedAssetsBalance_1100(BigDecimal row1110, BigDecimal row1120, BigDecimal row1130,
                                                   BigDecimal row1140, BigDecimal row1150, BigDecimal row1160,
                                                   BigDecimal row1170, BigDecimal row1180, BigDecimal row1190)
                                                   throws IncorrectDataException {
        if (row1110 == null || row1120 == null || row1130 == null || row1140 == null || row1150 == null || row1160 == null ||
                row1170 == null || row1180 == null || row1190 == null)
            throw new IncorrectDataException(message);

        BigDecimal result = row1110.add(row1120).add(row1130).add(row1140).add(row1150).add(row1160)
                .add(row1170).add(row1180).add(row1190);
        return result;
    }

    public BigDecimal sumOfCurrentAssetsBalance_1200(BigDecimal row1210, BigDecimal row1220, BigDecimal row1230,
                                                     BigDecimal row1240, BigDecimal row1250, BigDecimal row1260)
                                                     throws IncorrectDataException {
        if (row1210 == null || row1220 == null || row1230 == null || row1240 == null || row1250 == null || row1260 == null)
            throw new IncorrectDataException(message);
        BigDecimal result = row1210.add(row1220).add(row1230).add(row1240).add(row1250).add(row1260);
        return result;

    }

    public BigDecimal sumOfCapitalAndReservesBalance_1300(BigDecimal row1310, BigDecimal row1320, BigDecimal row1330,
                                                          BigDecimal row1340, BigDecimal row1350, BigDecimal row1360,
                                                          BigDecimal row1370) throws IncorrectDataException {

        if (row1310 == null || row1320 == null || row1330 == null || row1340 == null || row1350 == null || row1360 == null || row1370 == null)
            throw new IncorrectDataException(message);

        BigDecimal result = row1310.add(row1320).add(row1330).add(row1340).add(row1350).add(row1360).add(row1370);
        return result;

    }


    public BigDecimal sumOfLongTermDutiesBalance_1400(BigDecimal row1410, BigDecimal row1420, BigDecimal row1430,
                                                      BigDecimal row1440, BigDecimal row1450) throws IncorrectDataException {

        if (row1410 == null || row1420 == null || row1430 == null || row1440 == null || row1450 == null)
            throw new IncorrectDataException(message);

        BigDecimal result = row1410.add(row1420).add(row1430).add(row1440).add(row1450);
        return result;

    }

    public BigDecimal sumOfShortTermDutiesBalance_1500(BigDecimal row1510, BigDecimal row1520, BigDecimal row1530,
                                                       BigDecimal row1540, BigDecimal row1550) throws IncorrectDataException {

        if (row1510 == null || row1520 == null || row1530 == null || row1540 == null || row1550 == null)
            throw new IncorrectDataException(message);

        BigDecimal result = row1510.add(row1520).add(row1530).add(row1540).add(row1550);
        return result;

    }

    public BigDecimal sumBalance_1700(BigDecimal row1300, BigDecimal row1400, BigDecimal row1500) throws IncorrectDataException {
        if (row1300 == null || row1400 == null || row1500 == null)
            throw new IncorrectDataException(message);

        BigDecimal result = row1300.add(row1400).add(row1500);
        return result;

    }
}
