import java.util.Scanner;

public class Number_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B[] = new int[A];
        int result = 0;
        String C = scan.next();
        String D[] = C.split("");

        for (int i = 0; i < D.length; i++) {
            B[i] = Integer.parseInt(D[i]);
        }

        for (int i = 0; i < B.length; i++) {
            result += B[i];
        }
        scan.close();
        System.out.println(result);
    }
}