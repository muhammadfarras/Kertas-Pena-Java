package Ch3.J3_8_ControlFlow;

public class J_3_conditional_statement {
    public static void main(String[] args) {
        String val;
        if (44>2){
            val = "Yay true";
        }
        else {
            val = "Not true";
        }

        // Conditional statement as expression
        String val2 = 44>2?"Alhamdulillah True":"Qaddarullah False";

        System.out.println(val);
        System.out.println(val2);
    }
}
