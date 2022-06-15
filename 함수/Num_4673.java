import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num_4673 {

    static int selfNum(int a) {
        String A = Integer.toString(a);
        String B[] = A.split("");
        int value = a;
        for (int i = 0; i < B.length; i++) {
            value += Integer.parseInt(B[i]);
        }
        return value;
    }

    public static void main(String[] args) {
        List < String > A = new ArrayList < > ();
        int[] B = new int[10000];
        int count = 1;
        int count_2 = 0;
    

        while (count <= 10000) {
            B[count - 1] = selfNum(count);
            count++;
        }

        for (int i = 0; i < B.length; i++) {
            if (B[i] != 0) {
                count_2++;
            }
        }

        int C[] = new int[count_2];
        String D[] = new String[count_2];

        for (int i = 0; i < count_2; i++) {
            C[i] = B[i];
        }

        Arrays.sort(C);
        for (int i = 0; i < count_2; i++) {
            D[i] =Integer.toString(C[i]);
        }

        for(int i = 1; i<10000; i++){
            String h = Integer.toString(i);
            String stringToSearch =h;
            if(Arrays.asList(D).contains(stringToSearch)==false){
                A.add(h);
            }
        }

        for(String i : A){
            System.out.println(i);
        }


    }
}