import java.util.Arrays;
import java.util.Scanner;

public class Number_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        float B[] = new float[A];
        float sum = 0.0f;

        for (int i = 0; i < B.length; i++) {
            float C = scan.nextFloat();
            B[i] = C;
        }
        scan.close();
        Arrays.sort(B);
       


        for (int i = 0; i < B.length; i++) {
            if(i==A-1){
                B[i] = 100;
            }
            else{
                B[i]=B[i]/B[A-1]*100;
            }
        }

        for(int i = 0; i<B.length;i++){
            sum +=B[i];
        }

        System.out.println(String.format("%.2f", sum/B.length));
    }
}