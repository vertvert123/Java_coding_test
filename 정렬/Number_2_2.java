import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Number_2_2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(BF.readLine());
        int B[] = new int [A];
        int temp;
        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(BF.readLine());
        }
        for(int i=0; i<B.length; i++ ){
            if(B[i]>B[i+1]){
                temp = B[i];
                B[i] = B[i+1];
                B[i+1] = temp;
            }
            else if(i==B.length-1){
                break;
            }
        }
        
        System.out.println(Arrays.toString(B));
    }
}