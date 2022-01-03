import java.util.Scanner;

public class Number_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Hour = scan.nextInt();
        int Minute = scan.nextInt();

        int alarm_M = Minute - 45;

        if (alarm_M < 0) {
            Hour -= 1;
            alarm_M += 60;
            if (Hour < 0) {
                Hour = 23;
                System.out.println(Hour);
                System.out.println(alarm_M);

            } else {
                System.out.println(Hour);
                System.out.println(alarm_M);
            }
        } else {
            System.out.println(Hour);
            System.out.println(alarm_M);

        }
        scan.close();
    }
}