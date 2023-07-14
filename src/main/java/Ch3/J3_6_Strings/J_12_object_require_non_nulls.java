package Ch3.J3_6_Strings;
import java.util.Objects;

public class J_12_object_require_non_nulls {
    public static void main(String[] args) {
        String posiblyNull = null;
        checkEmptyAndNull(posiblyNull);
    }
    public static void checkEmptyAndNull(String text){
        String nonNull = Objects.requireNonNull(text,"Nilai tidak boleh null");
        System.out.println((nonNull.length()>0?text:"Variable null atau kosong"));
    }
}
