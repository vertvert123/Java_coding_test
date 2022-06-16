import java.util.Scanner;

public class Num_2675 {
    public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);
            int A = scan.nextInt();
            for (int i = 0; i < A; i++) {
                int B = scan.nextInt();
                String C = scan.next();
                
    
                for (int j = 0; j < C.length(); j++) {
                    for (int k = 0; k < B; k++) {
                        System.out.print(C.charAt(j));
                    }
                }
                System.out.println();
            }
    
            scan.close();
        
    }
}
