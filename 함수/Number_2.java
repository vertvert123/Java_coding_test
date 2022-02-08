
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
    public static boolean contains(final int[] arr, final int key) {
        return Arrays.asList(arr).contains(key);
    }
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        int[] B = new int [100];
        int count = 1;
        
        
        while(selfNum(count)<=100){
            B[count-1] = selfNum(count);
            count++;
        }
        Arrays.sort(B);
        System.out.println(Arrays.toString(B));
        count = 0;
        
        
        while(count<100){
            boolean opt = contains(B,count+1);
            if(!opt){
                A.add(count+1);
                count++;
            }
            else{
                count++;
            }
            
        }
        for(int i = 0; i<A.size();i++){
            System.out.println(A.get(i));
        }
       

    }
}
