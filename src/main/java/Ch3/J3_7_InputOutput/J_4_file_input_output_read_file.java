package Ch3.J3_7_InputOutput;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Scanner;

public class J_4_file_input_output_read_file {
    public static void main(String[] args) throws URISyntaxException, IOException {

        // Mengambil URL dari folder Resources
        URL url = Objects.requireNonNull(J_4_file_input_output_read_file.
                        class.getClassLoader().
                        getResource("MyFile.txt"),
                "URL tidak boleh kosong mas bor");

        // Membuat objek path, Scanner membutuhkan nilai dengan objek Path
        Path lokasiFile = Path.of(url.toURI());

        Scanner scanner = new Scanner(lokasiFile);
        // Reading file using while loop
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
