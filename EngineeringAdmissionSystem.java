import java.util.ArrayList;
import java.util.Scanner;

public class EngineeringAdmissionSystem{
    private ArrayList<EngineeringStudent> students;

    public EngineeringAdmissionSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(EngineeringStudent student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (EngineeringStudent student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        EngineeringAdmissionSystem system = new EngineeringAdmissionSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter student information:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();

            EngineeringStudent student = new EngineeringStudent(name, age, address, gpa);
            system.addStudent(student);

            System.out.println("Student added successfully!");
            System.out.println("Add another student? (yes/no)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        system.displayAllStudents();
    }
}

class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

}

class EngineeringStudent extends Person {
    private double gpa;

    public EngineeringStudent(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

}