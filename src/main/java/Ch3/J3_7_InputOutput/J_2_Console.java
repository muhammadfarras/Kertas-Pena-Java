package Ch3.J3_7_InputOutput;

//import java.io.Console;

import java.io.Console;

public class J_2_Console {
    public static void main(String[] args) {
        Console cs = System.console();
        System.out.println(cs);
        String userName = cs.readLine("Type username : ");
        char[] password = cs.readPassword("Type password : ");

        System.out.println(String.format("Username %d dengan password %d",
                userName,password.toString()));
    }
}
