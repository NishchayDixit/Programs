import java.util.Scanner;

public class GCD_5_6 {
    public static int gcd(int first_number, int second_number) {
        while (first_number != second_number) {
            if (first_number > second_number) {
                first_number -= second_number;
            }else {
                second_number -= first_number;
            }
        }
        return first_number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first_number = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second_number = scanner.nextInt();

        System.out.println("The GCD of " + first_number + " And " + second_number + " is: " + gcd(first_number, second_number));
    }
}
