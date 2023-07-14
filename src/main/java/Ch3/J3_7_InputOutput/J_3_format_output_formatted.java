package Ch3.J3_7_InputOutput;

public class J_3_format_output_formatted {
    public static void main(String[] args) {
        String product = "Laptop";
        double price = 14700000d;
        double discount = .271295;

        String value2 = ("Produk : %s \n" +
                "Harga : %,.0f \n" +
                "Price after discount : %,.2f\n").formatted(product,price,(price*(1-discount)));
        System.out.println(value2);
    }
}
