package Ch3.J3_6_Strings;

public class J_6_string_is_immutable {
    public static void main(String[] args) {
        String greets = "Hello";
        greets = greets.substring(0,3)+"p!!!";
        System.out.println(greets);
    }
}
