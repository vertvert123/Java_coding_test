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

    static String fd_answer(int a){
        String A = Integer.toString(a);

        return
    }

    public static void main(String[] args) {
        List < Integer > A = new ArrayList < > ();
        int[] B = new int[10000];
        int count = 1;
        int count_2 = 0;

        while (selfNum(count) <= 10000) {
            B[count - 1] = selfNum(count);
            count++;
        }

        for (int i = 0; i < B.length; i++) {
            if (B[i] != 0) {
                count_2++;
            }
        }

        String C[] = new String[count_2];

        for(int i=0; i<count_2; i++){
            C[i] = Integer.toString(B[i]);
        }

        Arrays.sort(C);
        System.out.println(Arrays.toString(C));

        for(int i = 0; i<10000;i++){
            Arrays.asList(C).contains()
    }
        }
        

}