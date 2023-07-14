package Ch3.J3_7_InputOutput;

import java.util.Scanner;

public class J_1_Scanner_sysin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Whats is your name ? ");
        String name = scanner.nextLine();
        System.out.print("Your ages ? ");
        int age = scanner.nextInt();
        System.out.println(String.format("Name is %s with age %d",name,age));
    }
}
