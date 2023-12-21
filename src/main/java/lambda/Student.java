package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

class StudentInfo {
    /*    void testStudents(ArrayList<Student> al, StudentChecks studentChecks) {
            for (Student s : al) {
                if (studentChecks.check(s)) {
                    System.out.println(s);
                }
            }
        }*/
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student student3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student student4 = new Student("Petr", 'm', 35, 4, 7);
        Student student5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students);
        System.out.println();

        StudentInfo info = new StudentInfo();


        /*Collections.sort(students, (st1, st2) -> st1.course - st2.course);
        System.out.println(students);
        System.out.println();


        //info.testStudents(students, (Student s) -> {return s.avgGrade > 8;});
        //info.testStudents(students, s -> s.avgGrade > 8);
        info.testStudents(students, (Student s) -> {
            return s.avgGrade > 8;
        });

        System.out.println();

        info.testStudents(students, (Student s) -> {
            return s.age < 30;
        });
        System.out.println();

        info.testStudents(students, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9.5 && s.sex == 'f';
        });

        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';
        info.testStudents(students,p1.and(p2));
        info.testStudents(students,p1.or(p2));
        info.testStudents(students,p1.negate());
*/
        Function<Student, Double> f = student -> student.avgGrade;
        double res=avgOfSmth(students,student -> student.avgGrade);
        double res2=avgOfSmth(students,student -> (double)student.course);
        double res3=avgOfSmth(students,student -> (double)student.age);
        System.out.println(res3);

    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student st : list) {
            result += f.apply(st);
        }
        result = result / list.size();
        return result;
    }
}

/*interface StudentChecks {
    boolean check(Student s);
}*/

/*class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}*/
