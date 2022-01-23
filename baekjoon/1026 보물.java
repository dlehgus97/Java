import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int A [] = new int [N];
        int B [] = new int [N];

        for(int i =0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        for(int i =0; i<N; i++) {
            B[i] = sc.nextInt();
        } 

        Arrays.sort(A);
        Arrays.sort(B);

        int result = 0;
        for(int i =0 ; i<N; i++){
            result += A[i] * B[N-i-1];
        }

        System.out.println(result);
    }

}

/*당연하겠지만  for(int i =0; i<N; i++) {
                 A[i] = sc.nextInt();
             }
                for(int i =0; i<N; i++) {
                 B[i] = sc.nextInt();
              } 
              을 붙여서 쓰면 
              for(int i =0; i<N; i++) {
                 A[i] = sc.nextInt();
                 B[i] = sc.nextInt();
             }
             예제값 입력3에서는 A와 B에 입력되는 값이 아래와 같이 된다. 
             A 5 100 39 0 26 12 2 4 9
             B 15 31 0  3 11 13 3 5 1 
             같은 반복문에 넣질 마시길 ..*/


