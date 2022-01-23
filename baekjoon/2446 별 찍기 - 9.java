import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        for(int i =0 ;i<N-1; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<((2*N)-1)-(2*i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i<N; i++){
            for(int j =0; j<N-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<(2*i)+1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}





//처음에 짠 코드인데 너무 반복문 범위도 맘대로 설정했고 이해하기 힘들다..
import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        sc.close();
        
        for(int i =0 ;i<N-1; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<((2*N)-1)-(2*i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i<=N; i++){
            for(int j =1; j<=N-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
