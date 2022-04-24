import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculater_3_6 {
	
	private static final DecimalFormat DECIMALFOR_FORMAT = new DecimalFormat("0.00");
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first value: ");
		int first_number = scanner.nextInt();
		System.out.print("Enter second value: ");
		int second_number = scanner.nextInt();
		System.out.println("The Avaliable Operations are given below: ");
		System.out.println("(1) + \n(2) - \n(3) * \n(4) / ");
		System.out.print("Enter the operation to perform: ");
		char operator = scanner.next().charAt(0);
		System.out.println("------------------------------------------");
		switch (operator) {
			case '+': System.out.println("The Addition of given two numbers is: " + (first_number + second_number));
					break;
			case '-': System.out.println("The Substraction of given two numbers is: " + (first_number - second_number));
					break;
			case '*': System.out.println("The Multiplication of given two numbers is: " + (first_number * second_number));
					break;
			case '/': System.out.println("The Divition of given two numbers is: " + (DECIMALFOR_FORMAT.format((double)first_number / second_number)));
					break;
		}
	}
}
