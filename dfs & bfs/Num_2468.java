import java.util.Scanner;

public class Num_2468{
    static int N;
    static int [][] Map;
    static int [][] trans;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static boolean[][] check;
    static int count;
    static int result;

    public static void Search(int x, int y){
        check[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x+dr[i];
            int ny = y+dc[i];

            if(nx>=0 && ny>= 0 && nx<N && ny<N){
                if(trans[nx][ny]==1 && !check[nx][ny]){
                    Search(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        Map = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                Map[i][j] = scan.nextInt();
                
            }
        }

        result = 1;

        for(int i=1; i<101; i++){
            trans = new int[N][N];

            count = 0;

            check = new boolean[N][N];

            for(int a = 0; a<N; a++){
                for(int b=0; b<N; b++){
                    if(Map[a][b]<=i){
                        trans[a][b]=0;
                    }
                    else{
                        trans[a][b]=1;
                    }
                }
            }
            for(int a=0; a<N; a++){
                for(int b = 0; b<N; b++){
                    if(trans[a][b]==1 && !check[a][b]){
                        Search(a, b);
                        count++;
                    }
                }
            }
            result = Math.max(result, count);
        }
        System.out.println(result);
        scan.close();
        
    }
    
}