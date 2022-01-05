import java.util.Scanner;

public class Number_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();

        for (int B = 0; B < A; B++) {
            int C = scan.nextInt();
            int D = scan.nextInt();
            System.out.println("Case #"+(B+1)+": "+(C + D));
        }
        scan.close();


    }

}
