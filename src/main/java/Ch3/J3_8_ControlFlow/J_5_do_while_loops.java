package Ch3.J3_8_ControlFlow;

public class J_5_do_while_loops {
    public static void main(String[] args) {
        int initialValue = 6;
        int maxValue = 5;

        do {
            initialValue ++;
            System.out.printf("%-7s %d\n","Nilai :",initialValue);
        }while(initialValue <= maxValue);
    }
}
