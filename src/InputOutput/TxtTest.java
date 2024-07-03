package InputOutput;

import java.io.*;

public class TxtTest {
    public static void main(String[] args) {
        String str = "Bunu dosyaya yazdir";

        File dosya = new File("dosyajava.txt");
        try {
            if (!dosya.exists()) {
                dosya.createNewFile();
            }

            FileWriter dosyayaYazma = new FileWriter(dosya, false);
            BufferedWriter bufferYazma = new BufferedWriter(dosyayaYazma);
            bufferYazma.write(str);
            bufferYazma.close();
            dosyayaYazma.close();

            FileReader dosyaOkuma = new FileReader(dosya);
            BufferedReader bufferOkuma = new BufferedReader(dosyaOkuma);
            String line;
            while ((line = bufferOkuma.readLine()) != null) {
                System.out.println(line);
            }
            bufferOkuma.close();
            dosyaOkuma.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
