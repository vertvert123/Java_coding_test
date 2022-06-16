import java.util.Scanner;

public class Num_10809{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result[] = new int[26];
        for(int i = 0; i<result.length; i++){
            result[i] = -1;
        }

        String A = "abcdefghijklmnopqrstuvwxyz";
        String word[] = A.split("");
       
        String S = scan.nextLine();
        String word_2[] = S.split("");
        
        
        for(int i = 0; i<word_2.length; i++){
            for(int j = 0; j<word.length; j++){
                if(word_2[i].equals(word[j])){
                    if(result[j]>=0){
                        result[j] = result[j];
                    }
                    else{
                        result[j] = i;
                    }
                    
                }
            }
            
        }
        for(int i = 0; i<result.length; i++){
            System.out.printf("%d ",result[i]);
        }

        scan.close();
        

    }
}