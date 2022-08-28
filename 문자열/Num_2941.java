import java.util.Scanner;

public class Num_2941{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        
        A = A.replaceAll("c=", "!");
        A = A.replaceAll("c-", "!");
        A = A.replaceAll("dz=", "!");
        A = A.replaceAll("d-", "!");
        A = A.replaceAll("lj", "!");
        A = A.replaceAll("nj", "!");
        A = A.replaceAll("s=", "!");
        A = A.replaceAll("z=", "!");

        System.out.println(A.length());
        scan.close();
    }
}