package Ch3.J3_6_Strings;

public class J_14_text_blocks {
    public static void main(String[] args) {
        String kalimat = """
                Bismillah
                Apa kabar kalian ?
                """;
        System.out.println(kalimat);

        String kalimatDua = """
                Alhamdulillah \
                baik, kalau kamu ?
                """;
        System.out.println(kalimatDua);
    }
}
