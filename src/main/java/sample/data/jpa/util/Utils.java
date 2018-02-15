package sample.data.jpa.util;

import java.math.BigDecimal;

public class Utils {

    private Utils() {

    }

    public static BigDecimal notNull(BigDecimal row) {
        if (row == null)
            return BigDecimal.ZERO;
        else return row;

    }
}
