import java.util.*;

public class Num_2667_BFS {
    static int N;
    static int danji [][];
    static boolean visit[][];
    static int dx[]= {-1,0,1,0};
    static int dy[]= {0,-1,0,1};
    static int count;
    static int count2;

    static void bfs(int x, int y){
        visit[x][y]=true;
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{x,y});
        count2++;

        while(!que.isEmpty()){
            int curx = que.peek()[0];
            int cury = que.peek()[1];
            que.poll();

            for(int i=0; i<4; i++){
                int nx = curx + dx[i];
                int ny = cury + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                  
                if (danji[nx][ny] == 1 && visit[nx][ny] == false) {
                    bfs(nx, ny);
                }
                
                else{

                }
            }
            else{

            }
        }
    }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        List <Integer> list  = new ArrayList<>();

        N = Integer.parseInt(A);
        danji = new int [N][N];
        visit = new boolean[N][N];
        for(int i=0; i<N; i++){
            String B = scan.nextLine();
            String[] C = B.split("");
            for(int j=0; j<N; j++){
                danji[i][j] = Integer.parseInt(C[j]);
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visit[i][j]==false&&danji[i][j]==1){
                    count++;
                    count2 = 0;
                    bfs(i,j);
                    list.add(count2);
                }
            }
        }
        System.out.println(count);
        Collections.sort(list);
        for(int q : list){
            System.out.println(q);
        }

    scan.close();   
    }
}
