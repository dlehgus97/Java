import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;
        for(int i = 0; i<N; i++){
            int total = i;
            int num = i;

            while(num>0){
                total += num%10;
                num /= 10;
            }
            if(total == N){
                result = i;
                break;
            }
        }
        System.out.println(result);

        }

    }

// 마지막 조건인 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다를 잘못 이해해서 살짝 오래걸렸다.
//처음에 result 값을 0으로 설정한다음 total 값이 주어진 N값과 같을떄는 result 값이 i가 되고 
//total 값이 해당되는 것이 없으면 result 값은 그대로 0을 출력한다 .
