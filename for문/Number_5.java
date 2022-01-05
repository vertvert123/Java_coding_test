import java.util.Scanner;

public class Number_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();


        for (int B = 1; B < A + 1; B++) {
            System.out.println(B);
        }

        scan.close();

    }

}