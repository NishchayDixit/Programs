import java.util.Scanner;
import static java.lang.System.out;

public class Palindrome_11_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String string = scanner.next();
        if (string.equals(String.valueOf(reverse(string)))) {
            out.println("Given String is Palindrome");
        }else {
            out.println("Given String is not Palindrome");
        }

    }
    static StringBuilder reverse(String str) {
        char character;
        StringBuilder newstring = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            newstring.insert(0, character);
        }
        return newstring;
    }
}
