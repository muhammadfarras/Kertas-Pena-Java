package Ch3.J_3_9_BigNumbers;

import java.math.BigInteger;

public class J_1_math_operator {
    public static void main(String[] args) {
        int angka = 27;
        BigInteger bi = BigInteger.valueOf(angka);

        // bi + 2 will trigger error at compile time

        BigInteger angka2 = new BigInteger("3");
        System.out.println(bi.add(angka2));
        System.out.println(bi.subtract(angka2));
        System.out.println(bi.multiply(angka2));
        System.out.println(bi.divide(angka2));
        System.out.println(bi.mod(angka2));
    }
}
