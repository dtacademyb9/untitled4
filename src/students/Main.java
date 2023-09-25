package students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View Students");
            System.out.println("4. Sort Students by GPA");
            System.out.println("5. Read Students from File");
            System.out.println("6. Write Students to File");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the extra newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();
                    studentManager.addStudent(new Student(id, name, age, gpa));
                    break;
                case 2:
                    System.out.print("Enter ID of the student to remove: ");
                    id = scanner.nextLine();
                    studentManager.removeStudent(id);
                    break;
                case 3:
                    studentManager.displayStudents();
                    break;
                case 4:
                    studentManager.sortStudentsByGPA();
                    break;
                case 5:
                    System.out.print("Enter filename to read students from: ");
                    String inputFile = scanner.nextLine();
                    studentManager.readStudentsFromFile(inputFile);
                    break;
                case 6:
                    System.out.print("Enter filename to write students to: ");
                    String outputFile = scanner.nextLine();
                    studentManager.writeStudentsToFile(outputFile);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please enter a valid option.");
            }
        }
    }
}

