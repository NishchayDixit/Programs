import java.util.Scanner;

public class Telephone_bill_3_8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the numbers of calls: ");
		int total_calls = scanner.nextInt();
		
		System.out.println("------------------------");
		
		if(total_calls <= 100) {
			System.out.println("Total Bill Amount: 200");
		}else if(total_calls > 100 && total_calls <= 150) {
			System.out.println("Total Bill Amount: " + (200 + (0.60 * (total_calls - 100))));
		}else if(total_calls > 150 && total_calls <= 200) {
			System.out.println("Total Bill Amount: " + (200 + (0.60 * 50) + (0.50 * (total_calls - 150))));
		}else {
			System.out.println("Total Bill Amount: " + (200 + (0.60 * 50) + (0.50 * 50) +(0.40 * (total_calls - 200))));
		}
	}
}