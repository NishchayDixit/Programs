import java.util.Scanner;
import static java.lang.System.out;

class Student{
    Scanner scanner = new Scanner(System.in);
    String enrollment_no,student_name, semester;

    public void getStudentDetails() {
        out.println("----------------------------");
        out.print("Enter Enrollment No: ");
        this.enrollment_no = scanner.nextLine();
        out.print("Enter Your Name: ");
        this.student_name = scanner.nextLine();
        out.print("Enter Your Semester: ");
        this.semester = scanner.nextLine();
    }
}

class Result{
    Scanner scanner = new Scanner(System.in);
    Double cpi, spi;
    String enrollment_no;

    public void getResultDetails() {
        out.println("----------------------------");
        out.print("Enter Enrollment No: ");
        this.enrollment_no = scanner.nextLine();
        out.print("Enter Your SPI: ");
        this.spi = scanner.nextDouble();
        out.print("Enter Your CPI: ");
        this.cpi = scanner.nextDouble();
    }

    public void displayResult(Student student) {
        out.println("----------------------------");
        out.println("\tSTUDENT DETAILS");
        out.println("----------------------------");
        out.println("Enrollment: " + this.enrollment_no);
        out.println("Name: " + student.student_name);
        out.println("Semester: " + student.semester);
        out.println("SPI: " + this.spi);
        out.println("CPI: " + this.cpi);

    }
}

public class ClassAndObject_9_1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.getStudentDetails();
        Result result = new Result();
        result.getResultDetails();
        result.displayResult(student);
    }
}