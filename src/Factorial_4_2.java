import java.util.Scanner;

public class Factorial_4_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		
		int factorial = 1;
		for(int i = 1; i <= number; i++) {
			factorial *= i;
		}
		System.out.println("-------------------------------------");
		System.out.println("The factorial of given number is: " + factorial);
	}
}
