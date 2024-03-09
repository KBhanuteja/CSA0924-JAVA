import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getTotalMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    public double getAverageMarks() {
        double averageMarks = (double) getTotalMarks() / marks.length;
        return averageMarks;
    }

    public void printMarkList() {
        System.out.println("Mark list for " + name + ":");
        System.out.println("Subject\tMark");
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" + marks[i]);
        }
    }
}

public class studentmarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Subject 1: ");
            int mark1 = scanner.nextInt();

            System.out.print("Subject 2: ");
            int mark2 = scanner.nextInt();

            System.out.print("Subject 3: ");
            int mark3 = scanner.nextInt();

            System.out.print("Subject 4: ");
            int mark4 = scanner.nextInt();

            System.out.print("Subject 5: ");
            int mark5 = scanner.nextInt();

            int[] marks = {mark1, mark2, mark3, mark4, mark5};
            students[i] = new Student(name, marks);
        }

        System.out.println("\nMark lists for all students:");
        for (Student student : students) {
            student.printMarkList();
            System.out.println("Total marks: " + student.getTotalMarks());
            System.out.printf("Average marks: %.2f%n", student.getAverageMarks());
        }
    }
}