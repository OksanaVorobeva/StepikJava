package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n"
                + "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда,открытая мной.\n";

        String s = "privet";

        try (FileWriter writer = new FileWriter("test1", true)) {
            /*for (int i = 0; i < ribai.length(); i++) {
                writer.write(ribai.charAt(i));
                System.out.println("Done!");
            }*/
            writer.write(rubai);
            writer.write(s);

        }
    }
}

