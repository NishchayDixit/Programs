import java.util.Scanner;

public class FibonacciSequence_5_3 {

    Scanner SCANNER = new Scanner(System.in);

    void fibonacci() {
        System.out.print("Enter limit of sequence: ");
        int sequence = SCANNER.nextInt();

        int n1 = 1, n2 = 1, temp;
        int flag = 0;

        System.out.print("[");
        for (int i = 0; i < sequence; i++) {
            if (flag != 0)
                System.out.print(", ");
            flag = 1;
            System.out.print(n1);
            temp = n2;
            n2 += n1;
            n1 = temp;
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        FibonacciSequence_5_3 fibonacciSequence = new FibonacciSequence_5_3();
        fibonacciSequence.fibonacci();
    }
}
