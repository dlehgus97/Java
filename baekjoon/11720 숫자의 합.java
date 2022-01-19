import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       String S = sc.next();
        int result = 0 ;
       for(int i = 0; i<N; i++){
           result += S.charAt(i) - 48;// result += S.charAt(i) - '0';
       }
       System.out.println(result);


    }
}




//charAt() 은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0'을 해줘야 정수값이 나온다 .
