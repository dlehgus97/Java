import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();

        sc.close();
        for(int i= 0; i<N-1; i++){
            System.out.print(" ");
        }
        System.out.println("*");

        for(int i=1 ; i<N; i++){
            if(N== 1){
                System.out.print("*");
                break;
            }
            if(i ==N-1) {
                for (int j = 0; j < (2 * N) - 1; j++) {
                    System.out.print("*");

                }
                break;
            }
            for(int k = 0;k<N-i-1; k++){
                System.out.print(" ");
            }
            for(int k = 0; k<1; k++){
                System.out.print("*");
            }
            for(int k =0; k<2*i-1; k++){
                System.out.print(" ");
            }
            for(int k = 0; k<1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

/*입출력 - 
2557, 1000, 2558, 10950, 10951, 10952, 10953, 11021, 11022, 11718, 11719
11720, 11721, 2741, 2742, 2739, 1924, 8393, 10818, 2438, 2439, 2440, 2441
2442, 2445, 2522, 2446, 10991, 10992
출처: https://plzrun.tistory.com/entry/알고리즘-문제풀이PS-시작하기 [plzrun's algorithm]
이 문제를 끝으로 입출력의 기본을 다 풀었고 DP할 차례 
코드를 봐도봐도 개같이 짠거같다 .. 후 ..*/
