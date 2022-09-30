import java.util.Scanner;

public class Num_2468_dfs {

    static int N;
	static int[][] map;
	static boolean[][] checked;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0,- 1, 0, 1};

    static int dfs(int x, int y, int height) {
		checked[x][y] = true;
		for(int i=0; i<4; i++) {
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			if(nx<0 || ny<0 || nx>N-1 || ny >N-1) continue;
			if(checked[nx][ny]) continue;
			if(map[nx][ny]> height) {
				dfs(nx,ny, height);
			}
		}
		return 1;
	}
 public static void main(String[] args) {
    int maxHeight=0;
    Scanner scan = new Scanner(System.in);
    N = scan.nextInt();
    map = new int[N][N];
    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            map[i][j] = scan.nextInt();
            if(map[i][j] > maxHeight) {
                maxHeight =map[i][j];
            }
            
        }
    } 
    
    int max =0;
    
		for(int height=0; height<maxHeight+1; height++) {
			checked = new boolean[N][N];
			int cnt=0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					
					if(!checked[i][j] && map[i][j] > height){
						cnt+=dfs(i,j,height); 
					}
					
				}
			}
			max = Math.max(max, cnt);
		}
		System.out.println(max);
        scan.close();
	}
   
    
 }   

