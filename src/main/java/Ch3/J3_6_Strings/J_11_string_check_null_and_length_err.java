// Rasie NullPointerException, karena menguji length terlebih dahulu jika variable yang diuji mengandung nilai NUll
package Ch3.J3_6_Strings;

public class J_11_string_check_null_and_length_err {
    public static void main(String[] args) {
        String stringNull = null;
        String stringDesc = "This is not null";

        checkEmptyAndNull(stringNull); // (1)! will raise and NullPointerException
        checkEmptyAndNull(stringDesc);
    }
    public static void checkEmptyAndNull(String text){
        System.out.println(text.length() >0 && text != null?
                text
                :"Variable null atau kosong");
    }
}
