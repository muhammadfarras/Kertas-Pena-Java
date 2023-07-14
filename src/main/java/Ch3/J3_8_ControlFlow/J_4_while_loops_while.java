package Ch3.J3_8_ControlFlow;

public class J_4_while_loops_while {
    public static void main(String[] args) {
        int initialValue = 0;
        int maxValue = 5;
        while (initialValue <= maxValue ){
            initialValue++; // equal val+=1
            System.out.printf("%-7s %d\n","Nilai :",initialValue);
        }
    }
}
