import java.util.*;

public class Num_2583{
    static int M , N , K;
    static int[][] table;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static boolean[][] visit;
    static ArrayList<Integer> result;
    static int count;
    static int resultcount;

    static void dfs(int x, int y){
        
        visit[x][y]=true;

        resultcount++;

        for(int i=0; i<4; i++){

            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx<M && cy<N && cx>=0 && cy>=0){
                if(table[cx][cy]==0 && visit[cx][cy]==false){
                    dfs(cx, cy);
                }
                else{
                    continue;
                }
            }
            else{
                continue;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp1 = scan.nextInt();
        int temp2 = scan.nextInt();
        
        K = scan.nextInt();

        M = temp1;
        N = temp2;

        table = new int[M][N];
        visit = new boolean[M][N];
        result = new ArrayList<>();

        for(int i=0; i<K; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();
            int D = scan.nextInt();
            
            for(int j=B; j<D; j++){
                for(int l=A; l<C; l++){
                    table[j][l]=1;
                }
            }
        }

        /*for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                System.out.print(table[i][j]);
            }
            System.out.println();
        }*/
        

        
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(visit[i][j]==false && table[i][j]==0 ){
                    count++;
                    resultcount = 0;
                    dfs(i,j);
                    result.add(resultcount);
                    
                }
                else{
                    continue;
                }
            }
        }

        System.out.println(count);
        Collections.sort(result);
        for(int t : result){
            System.out.print(t+ " ");
        }

        scan.close();
    }
}