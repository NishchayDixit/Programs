import java.util.Scanner;

class Candidate {
    int Candidate_ID, Candidate_Age, Candidate_Weight;
    String Candidate_Name;
    double Candidate_Height;
    Scanner scanner = new Scanner(System.in);

    void getCandidateDetails() {
        System.out.print("Enter Your ID: ");
        Candidate_ID = scanner.nextInt();
        System.out.print("Enter Your Name: ");
        Candidate_Name = scanner.next().trim();
        System.out.print("Enter Your Age: ");
        Candidate_Age = scanner.nextInt();
        System.out.print("Enter Your Weight: ");
        Candidate_Weight = scanner.nextInt();
        System.out.print("Enter Your Height: ");
        Candidate_Height = scanner.nextDouble();
    }

    void displayCandidateDetails() {
        System.out.println("Candidate ID: " + Candidate_ID);
        System.out.println("Candidate Name: " + Candidate_Name);
        System.out.println("Candidate Age: " + Candidate_Age + " Years");
        System.out.println("Candidate Weight: " + Candidate_Weight + " KG");
        System.out.println("Candidate Height: " + Candidate_Height + " Feet");
    }
}
public class ClassAndObject_7_1 {
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        candidate.getCandidateDetails();
        System.out.println("--------------------------");
        candidate.displayCandidateDetails();
    }
}
