import java.util.Scanner;

public class Num_1065 {

    public static int hansu(int A){
        int count = 1; 
        int count2 = 0;

        while(count <=A){
            if(count<100){// 100미만의 수는 전부 자리수의 차가 일정하기 때문에 상관없다.
                count2++;
                count++;
                continue;
            }
            else if(count<=0){
                count2 =0;
                break;
            }
            else if(count<=1000){// 100의자리 10의자리 1의자리 구해서 뺀 값이 같은지 확인해야한다.
                int B = (count-(count % 100))/100;
                int C = (count-(B*100))/10;
                int D = count-(B*100)-(C*10);
                int E = D-C;
                int F = C-B;

                if(E==F){
                    count2++;
                    count++;
                    continue;
                }
                else{
                    count++;
                    continue;
                }

            }
        }
        return count2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int answer = hansu(A);
        System.out.println(answer);
        scan.close();
    }
}
