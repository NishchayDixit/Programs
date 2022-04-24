import static java.lang.System.out;

class Member {
    String name, phone_number, address;
    int age;
    long salary;

    Member() {
        name = "";
        phone_number = "";
        address = "";
        age = 0;
        salary = 0;
    }

    public void printSalary() {
        out.println("Salary is: " + this.salary);
    }

}
class Employee extends  Member{

}
class Manager extends Member{

}

public class Inherit_10_1 {
    public static void main(String[] args) {

    }
}
