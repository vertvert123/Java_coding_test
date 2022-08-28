import java.util.Scanner;

public class Num_5622{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String[]B = A.split("");
        int result = 0;
        for(int i=0; i<B.length;i++){
            if( B[i].equals("A") || B[i].equals("B")||B[i].equals("C")){
                result += 3;
            }
            else if(B[i].equals("D") || B[i].equals("E")||B[i].equals("F")){
                result += 4;
            }
            else if(B[i].equals("G") || B[i].equals("H")||B[i].equals("I")){
                result += 5;
            }
            else if(B[i].equals("J") || B[i].equals("K")||B[i].equals("L")){
                result += 6;
            }
            else if(B[i].equals("M") || B[i].equals("N")||B[i].equals("O")){
                result += 7;
            }
            else if(B[i].equals("P") || B[i].equals("Q")||B[i].equals("R")||B[i].equals("S")){
                result += 8;
            }
            else if(B[i].equals("T") || B[i].equals("U")||B[i].equals("V")){
                result += 9;
            }
            else if(B[i].equals("W") || B[i].equals("X")||B[i].equals("Y")||B[i].equals("Z")){
                result += 10;
            }

        }
        System.out.println(result);
        scan.close();
    }
}