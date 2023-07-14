package Ch3.J3_7_InputOutput;

public class J_3_format_output_using_flags {
    public static void main(String[] args) {
        float negNumber = (-400000/3);
        float posNumber = (20000/2);

        System.out.printf("""
                This is negatif number : %,(.2f
                This is positive number : %,(.2f
                """, negNumber, posNumber);
    }
}
