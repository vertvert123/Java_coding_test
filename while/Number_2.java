import java.util.Scanner;

public class Number_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        while(scan.hasNextInt()){
            int A = scan.nextInt();
            int B = scan.nextInt();

            System.out.println(A+B);
        }
        scan.close();
    }
}