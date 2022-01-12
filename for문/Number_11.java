import java.util.Scanner;

public class Number_11{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        int[] C =new int[A];

        for(int i=0; i<A; i++){
            int D = scan.nextInt();
            C[i] = D;
            if(C[i]<B){
                System.out.println(C[i]);
            }
        }
        
        scan.close();
    }
}