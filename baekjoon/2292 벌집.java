import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = 1;
        int b = 1;
       while(N>a){
           a += 6*b;
           b+=1;

       }
        System.out.println(b);
        }

    }

//벌집의 시작숫자와 마지막 숫자들이 6으로 이루어진 수열이다 . 이점만 알고 있으면 될것 같다
