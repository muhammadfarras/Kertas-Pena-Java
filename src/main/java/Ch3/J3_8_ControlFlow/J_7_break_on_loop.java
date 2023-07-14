package Ch3.J3_8_ControlFlow;

public class J_7_break_on_loop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,5,6,7,8,9,10};

        for (int i : numbers){
            System.out.printf("Current number %d\n",i);

            if (i == 8) break; // Will break whle number reach 8
        }
        System.out.println("Java will stop looping");
    }
}
