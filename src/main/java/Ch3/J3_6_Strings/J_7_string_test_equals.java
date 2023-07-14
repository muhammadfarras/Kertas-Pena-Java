package Ch3.J3_6_Strings;

public class J_7_string_test_equals {
    public static void main(String[] args) {
        String greets = "Hello";
        String gree = "Hel";

        System.out.println((gree+"lo").equals(greets));
        System.out.println((gree+"lo") == greets);
    }
}
