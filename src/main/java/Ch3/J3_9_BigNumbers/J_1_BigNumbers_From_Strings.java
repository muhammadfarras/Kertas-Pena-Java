package Ch3.J_3_9_BigNumbers;

import java.math.BigDecimal;

public class J_1_BigNumbers_From_Strings {
    public static void main(String[] args) {
        double angka = 241491919819196116351616116964163.164896819841984198198498735498419819849874987;
        String angkaString = "241491919819196116351616116964163.164896819841984198198498735498419819849874987";

        BigDecimal bd = BigDecimal.valueOf(angka);
        System.out.print("BigDecimal dari `valueOf` : ");
        System.out.println(bd);

        BigDecimal bdFromString = new BigDecimal(angkaString);
        System.out.print("BigDecimal dari `constructor` : ");
        System.out.println(bdFromString);
    }
}
