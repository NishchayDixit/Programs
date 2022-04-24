import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int i = 0;
        String s = "";
        int a;
        System.out.println("================================");
        while(i < 3){
            s = scan.next();
            a = scan.nextInt();

            System.out.printf( "%-15s%03d\n", s, a);

            i++;
        }
        System.out.println("================================");
    }
}