package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student student3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student student4 = new Student("Petr", 'm', 35, 4, 7);
        Student student5 = new Student("Mariya", 'f', 23, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        List<Integer> courses = students.stream().
                mapToInt(e -> e.getCourse())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(courses);

        int sum = students.stream().mapToInt(e -> e.getCourse()).sum();
        System.out.println(sum);

        double avareg = students.stream().mapToInt(e -> e.getCourse())
                .average().getAsDouble();
        System.out.println(avareg);

        int min1 = students.stream().mapToInt(e -> e.getCourse())
                .min().getAsInt();
        System.out.println(min1);

        int max1 = students.stream().mapToInt(e -> e.getCourse())
                .max().getAsInt();
        System.out.println(max1);

        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(min);

        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(max);

        students.stream().filter(e -> e.getAge() > 20).forEach(System.out::println);
        System.out.println();
        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);
        System.out.println();
        students.stream().filter(e -> e.getAge() > 20).skip(3).forEach(System.out::println);

    }
}

