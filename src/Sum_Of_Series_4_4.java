import java.text.DecimalFormat;
import java.util.Scanner;

public class Sum_Of_Series_4_4 {
	
	private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number = scanner.nextInt();
		System.out.println("--------------------------------");
		System.out.print("1");
		for(int i = 2; i <= number; i++) {
			System.out.print("+1/"+ i);
		}
		System.out.println();
		System.out.println("--------------------------------");
		double sum = 0.0;
		for(int i = 1; i <= number; i++) {
			sum += 1.0/i;
		}
		System.out.println("The sum of given serise is: " + DECIMAL_FORMAT.format(sum));
	}
}
