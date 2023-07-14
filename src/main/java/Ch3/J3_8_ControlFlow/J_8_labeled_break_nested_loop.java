package Ch3.J3_8_ControlFlow;

public class J_8_labeled_break_nested_loop {
    public static void main(String[] args) {
        int[] numbers = {3,2,1};
        String[] letters = {"C","B","A"};

        letter_break_point:
        for ( int i : numbers){
            // without labeled break, break will occur at this point
            for (String b : letters){
                if (b.equals("C") && i == 2) break letter_break_point;
                System.out.println(i+" "+b);
            }
        }
    }
}
