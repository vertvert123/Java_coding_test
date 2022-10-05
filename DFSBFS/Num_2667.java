import java.util.*;

public class Num_2667 {

    static void dfs(int x, int y) {

        visited[x][y] = true;
        count2++;
        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];
            if (cx >= 0 && cy >= 0 && cx < N && cy < N) {
                  
                if (danji[cx][cy] == 1 && visited[cx][cy] == false) {
                    dfs(cx, cy);
                }
                else{

                }
            }
            else{

            }
        }
        }
    


    static int N;
    static boolean visited[][];
    static int danji[][];
    static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };
    static int count;
    static int count2;
    static String A;
    static String[] B;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String C = scan.nextLine();
        N = Integer.parseInt(C);
        visited = new boolean[N][N];
        danji = new int[N][N];

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A = scan.nextLine();
            B = A.split("");
            for (int j = 0; j < N; j++) {
                danji[i][j] = Integer.parseInt(B[j]);

            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j] == false && danji[i][j] == 1) {
                    count++;
                    count2 = 0;
                    dfs(i, j);
                    list.add(count2);
                }
                else{
                    continue;
                }
            }
        }
        Collections.sort(list);
        System.out.println(count);
        for(int q: list){
            System.out.println(q);
        }
        scan.close();
    }
}