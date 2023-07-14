package Ch3.J3_6_Strings;

public class J_5_concatenating_3_join {
    public static void main(String[] args) {
        String firstName = "Tania";
        String middleName = "Dwi";
        String lastName = "Haryanti";
        String fullName = String.join(" ",firstName,middleName, lastName);
        System.out.println(fullName);
    }
}
