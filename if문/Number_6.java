import java.util.Scanner;

public class Number_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Hour = scan.nextInt();
        int Minute = scan.nextInt();
        int add_min = scan.nextInt();

        int Change_Hour = add_min/60;
        int Change_min =  add_min%60;

        Hour += Change_Hour;
        Minute += Change_min;
        if(Minute>=60){
            Hour +=1;
            Minute -=60;
        }
        if(Hour>=24){
            Hour -=24;
        }
        
        
        System.out.printf("%d %d",Hour,Minute);
        scan.close();
    }
}