import java.util.Scanner;

public class Prime_5_4 {

    static int check(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int number = scanner.nextInt();
        int prime_number = check(number);

        if (prime_number != 0) {
            System.out.println("The Number Is Prime");
        }else {
            System.out.println("The Number Is Non-Prime");
        }
    }
}
