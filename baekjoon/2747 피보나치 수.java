import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 0; i<N-1; i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
            }

        }

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        System.out.print(Fibonacci(N));
            }

            public static int Fibonacci(int x){
                if(x <= 2) return 1;
                else
                return Fibonacci(x-1) + Fibonacci(x-2);



            }
        }


재귀함수로 풀었을때 시간초과가 나와서 반복문으로 풀었다. */

