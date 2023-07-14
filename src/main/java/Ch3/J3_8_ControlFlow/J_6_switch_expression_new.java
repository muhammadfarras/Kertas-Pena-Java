package Ch3.J3_8_ControlFlow;

public class J_6_switch_expression_new {
    public static void main(String[] args) {
        String warna = "BiruTua";
        String result = switch (warna){
            case "Hitam" -> "Warnya hitam";
            case "Merah" -> {
                yield "Warnya merah";
            }
            case "Biru" -> {
                System.out.println("Ini warnya akan menjadi biru");
                yield "Warnya biru";
            }
            default -> {
                yield "Tidak ada warna itu";}
        };

        System.out.printf("Warnya adalah %s", result);
    }
}
