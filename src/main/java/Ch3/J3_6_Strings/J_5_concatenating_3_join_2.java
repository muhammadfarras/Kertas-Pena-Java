package Ch3.J3_6_Strings;

public class J_5_concatenating_3_join_2 {
    public static void main(String[] args) {
        String[] name = {"Tania","Dwi","Haryanti"};
        String fullName = String.join(" ",name);
        System.out.println(fullName);
    }
}
