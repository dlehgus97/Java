import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 0 ; i<N; i++) {
           for(int j = 0; j<N-i-1; j++){
               System.out.print(" ");
           }
           for(int j =0; j<=i; j++){
               System.out.print("*");
           }
           System.out.println();
        }
        for(int i = 1; i<N; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=N-i; j++) {
                System.out.print("*");
            }
         System.out.println();
        }
    }

}

/*for (int j = N-1; j >=i; j--) {
                System.out.print("*");
            }
            마지막꺼를 이렇게 해도 된다.*/
