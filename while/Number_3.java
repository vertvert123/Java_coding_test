import java.util.ArrayList;
import java.util.Scanner;

public class Number_3 {

    public static int chkcount(int A){
        int Answer;
        ArrayList<Integer> list_int = new ArrayList<Integer>();


        list_int.add(A);

        

        while(true){
            if (list_int.get(0)==list_int.get(list_int.size()-1)){
                Answer =list_int.size();
                break;
            }
            else if(list_int.get(list_int.size()-1)>=10){
                list_int.add((A%10)*10+((A%10)+(A/10)));
            }
        }
        return Answer;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();

        System.out.println(chkcount(A));
        scan.close();
        
        
    }
    
}
