import java.util.Scanner;

public class Number_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char A = scan.next().charAt(0); // String을 char로 바꿔준다. 괄호안에 숫자 = 문자열 중에 어떤 문자를 가져올 것인지 정한다.
        scan.close();
        int B = A;
        System.out.println(B);
    }
}