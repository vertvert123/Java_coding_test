import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number_2 {
    static int selfNum(int a){
        String A = Integer.toString(a);
        String B[] = A.split("");
        int value = a;
        for(int i=0; i<B.length; i++){
            value += Integer.parseInt(B[i]);
        }
        return value;
    }
    public static void main(String[] args) {
        int[] A = new int [100];
        int[] B = new int [100];
        List <Integer> C = new ArrayList<>();
        List <Integer> D = new ArrayList<>();
        int[] E;
        int count = 1;
        for(int i =0; i<A.length;i++){
            A[i] = i+1;
        }
        
        while(selfNum(count)<=100){
            B[count-1] = selfNum(count);
            count++;
        }
        Arrays.sort(B);
        System.out.println(Arrays.toString(B));

        
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<B.length; j++){
                if(A[i]==B[j]){

                }
                else{
                    C.add(A[i]);
                }
            }
            
        }
        for(int i : C){
            if(!D.contains(i)){
                D.add(i);
            }
        }
       

    }
}
