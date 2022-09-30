import java.util.Scanner;

public class Num_1012{
    static int M, N, K;
	static int[][] cabbage;
	static boolean[][] visit;
	static int count;
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };

    static void dfs(int x, int y) {
		visit[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];

			if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
				if (!visit[cx][cy] && cabbage[cx][cy] == 1) {
					dfs(cx, cy);
				}
			}

		}

	}
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int i=0; i<T; i++){

            count = 0;
            M = scan.nextInt();
            N = scan.nextInt();

            cabbage = new int[M][N];
            visit = new boolean[M][N];

            K = scan.nextInt();

            for(int j = 0; j<K; j++){
                int A = scan.nextInt();
                int B = scan.nextInt();

                cabbage[A][B]=1;
            }

            for(int x = 0; x<M; x++){
                for(int y = 0; y<N; y++){
                    if(cabbage[x][y]==1 && !visit[x][y]){
                        dfs(x,y);
                        count = count+1;
                       
                    }
                   
                }
            }
            

            System.out.println(count);

        } 

        scan.close();
    }
    
    }
