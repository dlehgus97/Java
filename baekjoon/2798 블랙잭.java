import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int[100];
        int result = 0;
        for(int i =0; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i =0 ; i<N; i++){
            for(int j = i+1 ;j<N; j++){
                for(int k = j+1 ; k<N; k++){
                    if(arr[i] + arr[j] + arr[k] <=M && arr[i] + arr[j] + arr[k] >result)
                        result = arr[i] + arr[j] + arr[k];
                }
            }
        }
        System.out.println(result);


        }

}

/* 브루트 포스 문제이다 . 숫자를 입력받고 반복문을 통해 한 칸씩 다 더 할 수 있게 해준 것이다. 그렇게 더하면서 arr[i] + arr[j] + arr[k] <=M  값이 나오면 당연히 result 값은
처음에 0으로 설정했기때문에 arr[i] + arr[j] + arr[k] 값이 result 가 되면서 최댓값을 찾는 과정이다 . 
