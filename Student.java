import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;

    // Constructor to initialize the object
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate and return total marks
    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to display student details and total marks
    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks in 5 Subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("-----------------------------");
    }
}

public class StudentResultCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of Student objects
        Student[] students = new Student[5];

        // Read marks for 5 students
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            int[] marks = new int[5];
            for (int j = 0; j < marks.length; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume the newline character
            students[i] = new Student(name, marks);
        }

        // Display results for each student
        for (Student student : students) {
            student.displayResult();
        }
    }
}
