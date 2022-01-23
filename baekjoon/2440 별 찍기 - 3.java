//방법 1 
import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 0 ; i<N; i++) {
            for(int j = N; j>i; j--){
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
//방법 2
import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 0 ; i<N; i++) {
            for(int j = 0; j<=N-i-1; j++){
                System.out.print("*");
            }
           System.out.println();
        }
    }
}

/* for(int j = 0; j<=N-i-1; j++){
                System.out.print("*");
            }
            i의 시작이 0이기 때문에 j는 N-1까지의 반복문이다 .
            println이 아닌 print를 사용해서 "*" 를 쌓아 주는 식으로 한줄을 완성하고 
            개행문자를 포함하는 System.out.println();을 출력해준다 .
            
            반복문 안에 반복문은 가장 안쪽에 있는 반복문부터 반복해주는걸 꼭 생각해야 한다 .
            */
