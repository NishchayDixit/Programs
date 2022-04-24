import java.util.Scanner;

class Bank_Account {
    long Account_No, Account_Balance;
    String User_Name, Email, Account_Type;
    Scanner scanner = new Scanner(System.in);

    void getAccountDetails() {
        System.out.print("Enter Account Number: ");
        Account_No = scanner.nextLong();
        System.out.print("Enter User Name: ");
        User_Name = scanner.next().trim();
        System.out.print("Enter Email: ");
        Email = scanner.next().trim();
        System.out.print("Enter Account Type: ");
        Account_Type = scanner.next().trim();
        System.out.print("Enter Account Balance: ");
        Account_Balance = scanner.nextLong();
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + Account_No);
        System.out.println("User Name: " + User_Name);
        System.out.println("Email ID: " + Email);
        System.out.println("Account Type: " + Account_Type);
        System.out.println("Current Balance: " + Account_Balance);
    }

}

public class ClassAndObject_7_2 {
    public static void main(String[] args) {
        Bank_Account bank_account = new Bank_Account();
        bank_account.getAccountDetails();
        bank_account.displayAccountDetails();
    }
}
