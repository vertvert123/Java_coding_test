import java.util.Arrays;
import java.util.Scanner;


public class Number_2 {
    public static void main(String[] args) {
        int A[] = new int[9];
        int B[] = new int[9];
        int count = 1;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<A.length; i++){
            int C = scan.nextInt();
            A[i] = C;
            B[i] = C;

        }
        scan.close();
        Arrays.sort(A);
        System.out.println(A[8]);
        
        for(int i = 0; i<A.length; i++){
            if(A[8]==B[i]){
                System.out.println(count);
            }
            else{
                count++;
            }
        }
    


    }
}
