import java.util.Scanner;

public class Number_1 {
    static long sum(int[] a) {

        long answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B[] = new int[A];
        for (int i = 0; i < B.length; i++) {
            int C = scan.nextInt();
            B[i] = C;
        }
        long D = sum(B);
        scan.close();
        System.out.println(D);
    }
}