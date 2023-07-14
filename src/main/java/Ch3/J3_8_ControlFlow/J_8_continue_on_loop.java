package Ch3.J3_8_ControlFlow;

public class J_8_continue_on_loop {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i : numbers){
            if (i%2 == 0) continue; // Will back to head if even
            System.out.printf("%-4s %-3s %d\n","Data",":",i);
        }
    }
}
