package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        /*System.out.println("Введите число ");
        int i = scanner.nextInt();
        System.out.println(i);*/

       /* System.out.println("Напишите 2 числа ");
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        System.out.println(x/y);
        System.out.println(x%y);*/

       /* System.out.println("Напишите пару слов ");
        String s= scanner.nextLine();
        String d= scanner.nextLine();
        System.out.println(s+d);*/

        Scanner scanner =new Scanner("Привет мой друг\n Как поживаешь");
       /* String s= scanner.nextLine();
        System.out.println(s);
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());*/

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

    }
}
