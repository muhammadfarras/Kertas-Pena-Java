package Ch3.J3_6_Strings;

public class J_11_string_check_null_and_length {
    public static void main(String[] args) {
        String stringNull = null;
        String stringDesc = "This is not null";

        checkNullAndEmpty(stringNull);
        checkNullAndEmpty(stringDesc);
    }
    public static void checkNullAndEmpty(String text){
        System.out.println(text != null && text.length()>0?
                text
                :"Variable null atau kosong");
    }
}
