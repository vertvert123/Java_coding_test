import java.util.Scanner;

public class test {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String A = scan.next();
    String B[] = A.split("");
    
    for(int i=0; i<B.length;i++){
        System.out.println(B[i]);
    }
    scan.close();
    }
}
