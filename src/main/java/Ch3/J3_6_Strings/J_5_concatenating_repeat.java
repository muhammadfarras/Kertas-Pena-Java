package Ch3.J3_6_Strings;
import org.apache.commons.lang3.JavaVersion;
import org.apache.commons.lang3.SystemUtils;
public class J_5_concatenating_repeat {
    public static void main(String[] args) {
        if (SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_11)){
            String java = "Java";
            System.out.println(java.repeat(3));
        }
        else {
            System.out.println("Doesn't have repeat");
        }
    }
}
