import java.text.DecimalFormat;
import java.util.Scanner;

public class Class_From_Percentage_3_4 {
	
	private static final DecimalFormat decimalformate = new DecimalFormat("0.00"); 

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		int marks[] = new int[6];
		
		System.out.println("Enter Marks of Five Subjects: ");
		for(int i = 1; i < marks.length; i++) {
			System.out.print("(" + i + ") : ");
			marks[i] = scanner.nextInt();
		}
		
		int total = 0;
			
		for(int i = 0; i < marks.length; i++) {
			total += marks[i];
		}
			
		int average = total/5;
			
		//System.out.println(average);
			
		System.out.println("----------------------------------------------------------------------------");
			
		if(average < 35) {
			System.out.println("The Percentage is " + (decimalformate.format((double)(total / 500.00) * 100)) + "%\n\nYOU ARE SUCCESSFULY FAILED THE EXAM");
		}else if(average >= 35 && average < 45) {
			System.out.println("The Percentage is " + (decimalformate.format((double)(total / 500.00) * 100)) + "%\n\nYOU ARE PASS THE EXAM");
		}else if(average >= 45 && average < 60) {
			System.out.println("The Percentage is " + (decimalformate.format((double)(total / 500.00) * 100)) + "%\n\nYOU ARE PASS THE EXAM WITH SECOND CLASS");
		}else if(average >= 60 && average < 70) {
			System.out.println("The Percentage is " + (decimalformate.format((double)(total / 500.00) * 100)) + "%\n\nYOU ARE PASS THE EXAM WITH FIRST CLASS");
		}else if(average >= 70) {
			System.out.println("The Percentage is " + (decimalformate.format((double)(total / 500.00) * 100)) + "%\n\nCONGRATULATIONS, YOU HAVE CRACKED THE UPSC");
		}
	}
}
