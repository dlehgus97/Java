import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[][] = new int[51][2];
        int result [] = new int[51];

        for(int i =0 ; i<N; i++){
            arr[i][0] =sc.nextInt();    //배열의 첫번째 수
            arr[i][1] = sc.nextInt();   // 배열의 두번째수 
            result[i] = 1;
        }
        for(int i = 0 ; i<N; i++){
            for(int j =0 ; j<N; j++){
                if(arr[i][0] <arr[j][0] &&arr[i][1]<arr[j][1])    //기본적인 result[i]값을 1로 설정한다음에 둘다작으면 1을 추가하는 식이다 .
                    result[i] +=1;

            }
            System.out.print(result[i]+" ");
        }

    }
}
