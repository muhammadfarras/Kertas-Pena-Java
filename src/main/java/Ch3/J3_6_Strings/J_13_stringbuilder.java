package Ch3.J3_6_Strings;

public class J_13_stringbuilder {
    public static void main(String[] args) {
        // Stringbuilder 1
        StringBuilder catatanKaki = new StringBuilder();
        catatanKaki.append("Ditulis oleh : Muhammad Farras Ma'ruf\n");
        catatanKaki.append("-".repeat(30));

        // Stringbuilder 2
        StringBuilder isiPesan = new StringBuilder(); // Inisiasi
        isiPesan.append("Bismillah. Dengan menyebut nama Allah\n");
        isiPesan.append("Suret ke : ");
        isiPesan.append(2); // append int
        isiPesan.append("\nBertakwalah kepada Allah, tuhan satu-satunya " +
                "yang berhak untuk disembah\n");

        // Append another instance StringBuilder
        isiPesan.append(catatanKaki);
        System.out.println(isiPesan.toString());
    }
}
