import java.util.Scanner;

class Time {
    int hours;
    int minutes;
    Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    Time add(Time time) {
        Time time1 = new Time(this.hours, this.minutes);
        time1.hours = this.hours + time.hours;
        time1.minutes = this.minutes + time.minutes;
        time1.hours += time1.minutes/60;
        time1.minutes %= 60;
        return time1;
    }
}
public class Time_8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        Time time = new Time(hours, minutes);
        Time time1 = time.add(time);
        System.out.println("Time = " + time1.hours + " : " + time1.minutes);
    }
}
