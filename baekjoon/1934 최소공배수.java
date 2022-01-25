import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0 ; i<T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int result =  max(A,B);
            int answer = (B*A/result);
            System.out.println(answer);
        }
 
        sc.close();
    }
    
    public static int max(int a,int b){
        if(b ==0)
            return a;
        else
            return max(b,a%b);

    }

}

/*유클리드 호제법을 사용하여 푸는 문제이다 . 
유클리드 알고리즘은 2개의 자연수 또는 정식(整式)의 최대공약수를 구하는 알고리즘의 하나이다. 
호제법이란 말은 두 수가 서로(互) 상대방 수를 나누어(除)서 결국 원하는 수를 얻는 알고리즘을 나타낸다. 
2개의 자연수 a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면(단, a>b), 
a와 b의 최대공약수는 b와 r의 최대공약수와 같다. 이 성질에 따라, b를 r로 나눈 나머지 r'를 구하고,
다시 r을 r'로 나눈 나머지를 구하는 과정을 반복하여 나머지가 0이 되었을 때 나누는 수가 a와 b의 최대공약수이다

이 문제에서는 a>b를 고려할 필요가 없다 . b 가  a 보다 클때 결국 retrun을 통해 처음에 a = b 가 되고 b = a%b 가 된다.
따라서 다시 a>b인 상태가 되기때문에 상관 없어진다.
예를들면 a가 18이고 b가 32이면 
a는 32가 되고 b는 a%b이므로 18이 된다. 결국 이 둘은 순서가 바뀐채로 재귀하게 된다.
---> 
a = 32 b = 18
a = 18 b = 14
a = 14 b = 4
a = 4  b = 2
a = 2  b = 0 
b == 0 return a 이고 최대공약수도 a 이기에 최대공약수는 2이다 . 
