package work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream =
                     new FileInputStream("/Users/oksanavorobeva/Desktop/Otkrytki_Top.jpg");
             FileOutputStream outputStream = new FileOutputStream("Otkrytki_Top.jpg")) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
