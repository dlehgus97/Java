import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int result = 0;
        while (N >= 0) {
            if (N % 5 == 0) {
                result += N / 5;
                System.out.print(result);
                System.exit(0);
            }
            else
                N -= 3;
                result += 1;
        }
        System.out.print(-1);
    }
}


//while문 범위를 N>=0 으로 설정 했기때문에 0일때도 N%5 ==0 을 만족한다. 따라서 if문에  System.out.print(result);을 넣어도 원하는 출력값을 얻을수 있다.
//c++ 에서는 return 0; 을 사용했지만 java에서는  System.exit(0); 을 통해 프로그램을 종료해준다 .
//전체적으로 설탕봉지를 가져가는 수를 줄이기 위해 더 작은수인 3을 반복해서 빼준다음에 빼줬을 때마다 5로 나누어지는지를 확인한다 .
//5로 나눠질때  최소한으로 설탕봉지를 옮길 수 있기 때문 
//while문이 끝나고  System.out.print(-1);을 적은것은 4라는 예시를 들었을때 첫번째 반복문에서 3을빼주면 1이 되고 조건문에 성립하지 않기 때문에 다시 3을빼주면 -2가 된다.
//그렇게 되면 반복문이 끝나고 result값을 출력하기 위한 조건을 만족하지 못했기때문에 -1을 출력한다는 의미이다 .
