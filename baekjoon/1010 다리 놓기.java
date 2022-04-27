import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
            int result_1 = 1;
            int result_2 = 1;
            int N = sc.nextInt();
            int M = sc.nextInt();
            int total = 0;

            for (int k = M; k > M - N; k--) {
                result_1 *= k;
            }
            for (int s = N; s > 0; s--) {
                result_2 *= s;
            }
            total = result_1 /result_2;
            System.out.println(total);
        }
    }


}

//처음에 이렇게 풀었는데 long 으로 했을때 오버플로우가 발생할 수 있다.(long의 범위를 넘어서)
//BigInteger 를 사용해서 내일 풀어볼것 .!

