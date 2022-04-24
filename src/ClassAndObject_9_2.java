import java.util.Scanner;
import static java.lang.System.out;

class StudentD{
    Scanner scanner = new Scanner(System.in);
    Double spi;
    String enrollment_no, student_name, semester;

    public void getDetails() {
        out.print("Enter Enrollment No: ");
        this.enrollment_no = scanner.nextLine();
        out.print("Enter Your Name: ");
        this.student_name = scanner.nextLine();
        out.print("Enter Your Semester: ");
        this.semester = scanner.nextLine();
        out.print("Enter Your SPI: ");
        this.spi = scanner.nextDouble();
    }
    public void displayDetails() {
        out.println("----------------------------");
        out.println("\tSTUDENT DETAILS");
        out.println("----------------------------");
        out.println("Enrollment: " + this.enrollment_no);
        out.println("Name: " + this.student_name);
        out.println("Semester: " + this.semester);
        out.println("SPI: " + this.spi);
    }

}

public class ClassAndObject_9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentD[] studentDS = new StudentD[5];

        for (int i = 0; i < studentDS.length; i++) {
            studentDS[i] = new StudentD();
            studentDS[i].getDetails();
        }
        for (StudentD studentD : studentDS) {
            studentD.displayDetails();
        }
    }
}
