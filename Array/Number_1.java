import java.util.Scanner;

public class Number_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B[] = new int[A];
        int MAX=B[0];
        int MIN=B[0];

        for(int C = 0; C<A; C++){
            int D = scan.nextInt();
            B[C] = D;
        }

        for(int C = 0; C<A; C++){
            if(MAX < B[C]){
                MAX = B[C];
            }
        }

        for(int C= 0; C<A; C++){
            if(MIN > B[C]){
                MIN = B[C];
            }
        }


        System.out.println(MAX);
        System.out.println(MIN);
        scan.close();
    }
}