package work_with_files;

import java.io.*;

public class DataStreamEx {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(
                new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(
                     new FileInputStream("my_test.bin")
             )) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(120);
            outputStream.writeLong(1_000_000);
            outputStream.writeFloat(3.123f);
            outputStream.writeDouble(123.45);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
