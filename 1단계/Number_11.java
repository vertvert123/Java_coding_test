import java.util.Scanner;

public class Number_11 {
    public static void main(String[] args) {
        
        Scanner scan =  new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = B/100;//백의 자리 추출
        int D = (B/10)-(C*10);//십의 자리 추출
        int E = B-((B/10)*10);//일의 자리 추출


        System.out.println(A*E);
        System.out.println(A*D);
        System.out.println(A*C);
        System.out.println(A*B);

        scan.close();
    }
    
}
