import java.util.Scanner;

public class Number_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        String S = "*";
        
        for(int B=1; B<A+1;B++){
            for(int C=0; C<B;C++){
                System.out.print(S);
            }
            System.out.println();
        }
        scan.close();
        
    }
    
}
