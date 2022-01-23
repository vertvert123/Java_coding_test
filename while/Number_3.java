import java.util.Scanner;

public class Number_3 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = 0;
        int C = 0;
        int count = 0;
        if(A <10){
            C =A*10+A;
            count++;
        }
        else{
            B = A/10+A%10;
            C = A%10*10+B%10;
            count++;
        }
        
        while(C!=A){
            B = C/10+C%10;
            C = C%10*10+B%10;
            count ++;
        }
        System.out.println(count);
        scan.close();
        
    }
    
}
