package StudentRecords;

import java.util.Scanner;

public class StudentRecords {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of students:");
            int n = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            Students[] students = new Students[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the details for student :" + (i + 1));
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Marks: ");
                int marks = sc.nextInt();
                sc.nextLine(); // Consume the newline character

                students[i] = new Students(id, name, marks);
            }

            System.out.println("Student Records:");
            for (Students s : students) {
                s.displayInfo();
                System.out.println("-------------------");
            }
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


