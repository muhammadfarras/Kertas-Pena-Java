package Ch3.J3_8_ControlFlow;

public class J_6_switch_statement {
    public static void main(String[] args) {
        String warna = "Merah";
        String result = "";
        switch (warna){
            case "Hitam":
                result = "Warnya hitam";
                break;
            case "Merah":
                result = "Warnya merah";
                break;
            case "Biru":
                result = "Warnya biru";
                break;
            default:
                result = "Tidak ada warna itu";
        }
        System.out.printf("Warnya adalah %s", result);


    }
}
