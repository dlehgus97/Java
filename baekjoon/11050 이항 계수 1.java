import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int result_1 = 1;
        int result_2 = 1;
        sc.close();

        for(int i = N; i>N-K; i--){
            result_1 *=i;
        }
        for(int i = K; i>=1; i--){
            result_2 *=i;
        }
        int total =result_1/result_2;
        System.out.print(total);
    }

}
