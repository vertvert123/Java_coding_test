import java.util.Scanner;

public class Number_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[] = new int[42];
        int B[] = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int C = scan.nextInt();
            B[i] = C % 42;
        }

        scan.close();
        for (int i = 0; i < B.length; i++) {
            A[B[i]] = 1;
        }

        for(int i = 0; i<A.length; i++){
            if(A[i]==1){
                count++;
            }
        }

        System.out.println(count);
    }
}