import java.util.Scanner;

public class Divisible_By_two_4_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Starting Number: ");
		int start_from = scanner.nextInt();
		System.out.print("Enter End Number: ");
		int end_to = scanner.nextInt();
	
		int flag=0;
		System.out.println("------------------------------------------------------");
		
		System.out.println("List of numbers which are divisible by 2 but not by 3: ");
		System.out.print("[");
		for(int i = start_from; i <= end_to; i++) {
			if(i%2 == 0 && i%3 != 0) {
				if(flag!=0)
					System.out.print(", ");
				flag=1;
				System.out.print(i);
			}
		}
		System.out.print("]");
	}
}
