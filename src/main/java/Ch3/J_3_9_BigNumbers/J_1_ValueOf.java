package Ch3.J_3_9_BigNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class J_1_ValueOf {
    public static void main(String[] args) {
        int angka = 20000;
        BigInteger angkaBig = BigInteger.valueOf(angka);
        System.out.println(angkaBig);
        System.out.printf("Variable angkaBig instanceof BigInteger : %b\n",angkaBig instanceof BigInteger);

        BigDecimal angkaDecimalBig = BigDecimal.valueOf(240654698480.4848);
        System.out.println(angkaDecimalBig);
        System.out.printf("Variable angkaBig instanceof BigInteger : %b",angkaDecimalBig instanceof BigDecimal);

    }
}
