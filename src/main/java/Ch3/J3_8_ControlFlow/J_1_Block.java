package Ch3.J3_8_ControlFlow;

public class J_1_Block {
    public static void main(String[] args) {
        int val = 2;
        {
            int blockVal = 4;
            System.out.println(val);
            System.out.println(blockVal);
        }
//        System.out.println(blockVal); // Will raise error on compile time
    }
}
