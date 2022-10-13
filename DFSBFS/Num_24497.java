import java.util.*;

public class Num_24497 {
    static ArrayList < Integer > [] A;
    static boolean visited[];
    static int N, M, R;

    static void dfs(int v) {
        if (visited[v] == false) {
            visited[v] = true;
            for (int i: A[v]) {
                if (visited[i] == false) {
                    dfs(i);
                    System.out.println();
                }
            }
        } else {
            return;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        R = scan.nextInt();

        A = new ArrayList[N + 1];

        visited = new boolean[N + 1];


        for (int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList < Integer > ();
        }

        for (int i = 0; i < M; i++) {
            int C = scan.nextInt();
            int D = scan.nextInt();
            A[C].add(D);
            A[D].add(C);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }
        for (int i = 1; i <= N; i++) {
            for(int j=0;j<A[i].size();j++){
                dfs(A[i].get(j));
            }
            
        }






        scan.close();
    }

}