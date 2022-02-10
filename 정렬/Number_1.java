import java.util.Arrays;
import java.util.Scanner;

public class Number_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int[] B = new int[A];
        for(int i=0; i<B.length; i++){
            B[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(B);

        for(int i=0; i<B.length; i++){
            System.out.println(B[i]);
        }
    }
}