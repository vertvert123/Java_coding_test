import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num_2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        for (int i = 0; i < A; i++) {
            int B = scan.nextInt();
            String C = scan.next();
            String D[] = C.split("");
            List < String > E = new ArrayList < > ();

            for (int j = 0; j < D.length; j++) {
                for (int k = 0; k < B; k++) {
                    E.add(D[j]);
                }
            }

            for (String q: E) {
                System.out.printf("%s", q);
            }

        }

        scan.close();
    }
}