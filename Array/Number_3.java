import java.util.Scanner;

public class Number_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = A * B * C;

        String E = Integer.toString(D);

        String F[] = new String[E.length()];
        int G[] = {
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0
        };

        F = E.split("");
        for (int i = 0; i < F.length; i++) {
            if (F[i].equals("0")) {
                G[0] += 1;
            } else if (F[i].equals("1")) {
                G[1] += 1;
            } else if (F[i].equals("2")) {
                G[2] += 1;
            } else if (F[i].equals("3")) {
                G[3] += 1;
            } else if (F[i].equals("4")) {
                G[4] += 1;
            } else if (F[i].equals("5")) {
                G[5] += 1;
            } else if (F[i].equals("6")) {
                G[6] += 1;
            } else if (F[i].equals("7")) {
                G[7] += 1;
            } else if (F[i].equals("8")) {
                G[8] += 1;
            } else {
                G[9] += 1;
            }
        }
        for (int i = 0; i < G.length; i++) {
            System.out.println(G[i]);

        }

        scan.close();

    }
// String을 비교 할땐 == 보단 equals를 쓰자.
}