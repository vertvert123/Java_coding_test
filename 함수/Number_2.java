

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
        int count = 1;
        for(int i =0; i<A.length;i++){
            A[i] = i+1;
        }
        
        while(selfNum(count)<=100){
            B[count-1] = selfNum(count);
            count++;
        }
        count = 0;

        while(count!=100){
            for(int i = 0; i<A.length;i++){
                if(A[count]==B[i]){
                    count++;
                    continue;
                }
                else{
                    System.out.println(A[count]);
                    count++;
                    
                }
            }
        }

    }
}
