package br.com.factory.method.util;

import java.math.BigDecimal;

public class NumberUtil {
    public static BigDecimal generateRandomBigDecimalFromRange(BigDecimal min, BigDecimal max) {
        BigDecimal randomBigDecimal = min.add(new BigDecimal(Math.random()).multiply(max.subtract(min)));
        return randomBigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    public static double generateRandomDoubleFromRange(int min, int max) {
        return (Math.random() * ((max - min) + 1)) + min;
    }

}
