import java.util.Arrays;
import java.util.Scanner;

public class Number_other {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[] = new int[3];
        for(int i=0;i<3;i++){
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        System.out.println(A[1]);
        scan.close();
    }
}
