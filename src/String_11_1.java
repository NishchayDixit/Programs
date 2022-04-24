import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class String_11_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        out.print("Enter string: ");
        String string = bufferedReader.readLine();
        int length = 0;
        for(char c : string.toCharArray()) {
            length++;
        }
        out.println("Length of String is: " + length);
//        try {
//            for(;string[length] != '\0'; length++);
//        }catch (Exception e) {
//            out.println("Length of String is: " + string.length);
//        }
    }
}
