package genetics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Schoolar schoolar3 = new Schoolar("Miha", 12);
        Schoolar schoolar4 = new Schoolar("Macha", 10);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> shoolarTeam = new Team("1");
        shoolarTeam.addNewParticipant(schoolar1);
        shoolarTeam.addNewParticipant(schoolar2);

        Team<Schoolar> shoolarTeam2 = new Team("1");
        shoolarTeam.addNewParticipant(schoolar3);
        shoolarTeam.addNewParticipant(schoolar4);

        Team<Student> studentTeam = new Team<>("2");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("3");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        shoolarTeam.playWith(shoolarTeam2);


    }
}
