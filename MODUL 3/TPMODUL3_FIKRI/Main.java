import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name : ");
        String studentName = scanner.nextLine();

        int studentID = 0;
        boolean validID = false;
        do {
            try {
                System.out.print("Enter student ID : ");
                studentID = scanner.nextInt();
                validID = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for student ID");
                scanner.nextLine(); 
            }
        } while (!validID);

        System.out.print("Enter Courses to enroll in (separated by commas) : ");
        scanner.nextLine();
        String coursesInput = scanner.nextLine();
        String[] courses = coursesInput.split(", ");

        Student student = new Student(studentName, studentID);
        for (String course : courses) {
            student.enrollInCourse(course);
        }
        System.out.println(" ");

        System.out.println(student.getUserDetails());

        Teacher teacher = new Teacher("\nPak Yoga Raditya", 133311313);
        teacher.teachClass("math");

        Admin admin = new Admin("Hudza", 121212121);
        admin.manageSystem("university system");

        scanner.close();
    }
}
