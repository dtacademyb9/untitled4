package students;

import java.io.*;
import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    public Student getStudent(String id) {
        for (Student student : students) {
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;

    }

    public void sortStudentsByGPA() {
        students.sort(Comparator.comparing(Student::getGpa).reversed());
    }

    public void readStudentsFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                double gpa = Double.parseDouble(parts[3]);
                Student student = new Student(id, name, age, gpa);
                students.add(student);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading students from file: " + e.getMessage());
        }
    }

    public void writeStudentsToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Student student : students) {
                writer.write(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getGpa());
            }
        } catch (IOException e) {
            System.out.println("Error writing students to file: " + e.getMessage());
        }
    }

    public void displayStudents() {
        students.forEach(System.out::println);
    }
}

