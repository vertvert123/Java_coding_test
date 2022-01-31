import java.util.Arrays;
import java.util.Scanner;

public class Number_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();

        String B[] = new String[A];

        for (int i = 0; i < B.length; i++) {
            B[i] = scan.next();
        }

       for (int i = 0; i < B.length; i++) {
            int addcount = 0;
            int count = 0;
            String C[] = new String[B[i].length()];
            C = B[i].split("");
            for (int j = 0; j < C.length; j++) {
                if (C[j].equals("O") && j == 0) {
                    addcount = 1;
                    count += addcount;
                } else if (C[j].equals("O") && C[j - 1].equals("O")) {
                    addcount += 1;
                    count += addcount;
                } else {
                    addcount = 0;
                    count += addcount;
                }
                System.out.println(count);   
            }
        }
        scan.close();

    }
}