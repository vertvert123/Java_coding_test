import java.util.Scanner;

public class Number_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = 0;

        for (int C = 1; C < A + 1; C++) {
            B += C;
        }
        System.out.println(B);
        scan.close();

    }
}