import java.util.Scanner;

public class Number_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();


        for (int B = 1; B < A; B++) {
            System.out.println(A - B);
        }

        scan.close();

    }
}