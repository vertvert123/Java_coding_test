import java.util.Scanner;

public class Number_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A =  scan.nextInt();
        int B[] = new int[A];
        for(int i = 0; i<B.length; i++){
            int E = 0;
            Double F = 0.0;
            Double G = 0.0;
            int C = scan.nextInt();
            int D [] = new int[C];

            for(int j = 0; j<D.length; j++){
                D[j] = scan.nextInt();
                E += D[j];
            }
            F = (double) (E/D.length);

            for(int k = 0; k<D.length; k++){
                if(D[k]>F){
                    G +=1;
                }
                else{
                }
            }
            System.out.println(String.format("%.3f", G/D.length*100)+"%");// 소수점자리 출력
        }
        scan.close();

        
    }
}
