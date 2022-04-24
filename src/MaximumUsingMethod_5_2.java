import java.util.Scanner;

public class MaximumUsingMethod_5_2 {

    Scanner SCANNER = new Scanner(System.in);

    void maximumNumber() {
        System.out.print("Enter First Number: ");
        int first_number = SCANNER.nextInt();
        System.out.print("Enter Second Number: ");
        int second_number = SCANNER.nextInt();

        System.out.println("-----------------------");

        if (first_number == second_number) {
            System.out.println("Both Numbers are equal");
        }else if (first_number > second_number) {
            System.out.println(first_number + " is largest");
        }else {
            System.out.println(second_number + " is largest");
        }
    }

    public static void main(String[] args) {
        MaximumUsingMethod_5_2 maximumUsingMethod = new MaximumUsingMethod_5_2();
        maximumUsingMethod.maximumNumber();
    }
}
