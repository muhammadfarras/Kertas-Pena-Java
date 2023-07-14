package Ch3.J3_8_ControlFlow;

public class J_6_switch_expression_2 {
    enum LANG{
        IND
    }
    public static void main(String[] args) {
        int month = 1;
        String lang = "ENG";
        String wordMonth = switch (month){
            case 1  -> {
                System.out.printf("User using %s\n",lang);
                yield lang.equalsIgnoreCase(LANG.IND.toString())? "Januari":"January";
            }
            case 5 -> {
                System.out.printf("User using %s",lang);
                yield lang.equalsIgnoreCase(LANG.IND.toString())? "Mei":"May";
            }
            case 9 -> "September";
            case 12  -> lang.equalsIgnoreCase(LANG.IND.toString())? "Desember":"December";
            default -> "Tidak masuk dalam range";
        };

        System.out.println(wordMonth);
    }
}
