import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleInterest_5_1 {

    DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Enter Rate Of Interest: ");
        int rate_of_interest = scanner.nextInt();
        System.out.print("Enter Number Of Years: ");
        int number_of_years = scanner.nextInt();

        SimpleInterest_5_1 simpleInterest = new SimpleInterest_5_1();

        simpleInterest.calculateInterest(principal, rate_of_interest, number_of_years);
    }

    public void calculateInterest(double principle, double rate_of_interest, double number_of_years) {
        double simpleinterest = principle * rate_of_interest * number_of_years;
        System.out.println("Simple Interest: " + (DECIMAL_FORMAT.format(simpleinterest)));
    }
}