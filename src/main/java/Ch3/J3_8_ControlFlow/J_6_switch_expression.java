package Ch3.J3_8_ControlFlow;

public class J_6_switch_expression {
    public static void main(String[] args) {
        String warna = "Biru";
        String result = switch (warna){
            case "Hitam":
                yield "Warnya hitam";
            case "Merah":
                yield  "Warnya merah";
            case "Biru":
                yield "Warnya biru";
            default:
                yield "Tidak ada warna itu";
        };

        System.out.printf("Warnya adalah %s", result);
    }
}
