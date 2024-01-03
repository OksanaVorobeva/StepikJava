package work_with_files.programmer2;

import work_with_files.programmer1.Employees;

import java.io.*;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employees employees;

        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees2.bin")
        )) {
            employees = (Employees) inputStream.readObject();
            System.out.println(employees);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
