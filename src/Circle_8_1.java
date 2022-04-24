import java.text.DecimalFormat;
import java.util.Scanner;

class Circle {
    Scanner scanner;
    double radius;
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");
    void getData(){
        System.out.print("Enter value of radius: ");
        scanner = new Scanner(System.in);
        this.radius = scanner.nextDouble();
    }
    void perimeter() {
        System.out.println("Perimeter of Circle: " + (DECIMAL_FORMAT.format((double) Math.PI * this.radius)));
    }
    void area() {
        System.out.println("Area of Circle: " + (DECIMAL_FORMAT.format((double) Math.PI * this.radius * this.radius)));
    }
}

public class Circle_8_1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getData();
        circle.perimeter();
        circle.area();
    }
}
