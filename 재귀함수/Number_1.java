import java.util.Scanner;

public class Number_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        System.out.println(function (A));
        scan.close();

    }
    public static int function (int num) {

        if (num <= 1) {
            return 1;
        } else {
            return function (num - 1) * num;
        }
    }
}