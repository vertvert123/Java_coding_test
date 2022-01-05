import java.util.Scanner;

public class Number_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        String S = "*";
        int B = A-1;

        for(int C = 1; C<A+1; C++){
            for(int D = B; D>0; D--){
                System.out.print(" ");
            }
            for(int E = 0; E<C; E++){
                System.out.print(S);
            }
            System.out.println();
            B--;
        }
        
        
        

        scan.close();

    }
}