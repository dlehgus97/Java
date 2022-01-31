//방법 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int Num = 10001;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[Num];    
        for(int i = 0 ; i<N; i++){
            arr[Integer.parseInt(br.readLine())] += 1;
        }

       //100000번을 반복해서 arr[i]의 수만큼 i를 출력하는 방식 
        for(int i = 0; i<Num; i++){
            for(int j = 0; j<arr[i]; j++){
                sb.append(i).append("\n");
                }
            }
        System.out.print(sb);

    }
}

//방법 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int Num = 10000;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());


        int [] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for(int i =0 ; i<N; i++){
            sb.append(arr[i]).append("\n");
        }

        System.out.print(sb);
    }
}


/*Scanner을 통한 방법은 시간초과가 나와서 급하게 BufferedReader 짧게 공부해서 풀은 문제 
방법 1같은 경우는  int [] arr = new int[Num]에 Num에 해당하는 값에 N을 집어넣어서 초반에 틀렸다 .N 변수의 값은  몇개를 입력받을지에 관한수이지 이 방법에서는 
배열의 크기와는 관련 지어서 안된다.  arr[Integer.parseInt(br.readLine())]은 arr에 입력할 숫자를 넣어주고 넣어 줄때마다 +1 식 해주는 것이다 .
아래 반복문은 100000번을 반복해서 arr[i]의 수만큼 i를 출력하는 방식 
      
 



아래는 시간초과로 틀린 방법 

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] arr = new int[N];
        for(int i = 0 ; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i = 0 ;  i<N; i++){
            System.out.println(arr[i]);
        }
        }
    }

import java.util.Scanner;
public class Main {
    static int Num = 10000000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] arr = new int[N];
        for(int i = 0 ; i<N; i++){
            arr[sc.nextInt()] += 1;
        }

        for(int i = 0; i<Num; i++){
            for(int j = 0; j<arr[i]; j++){
                System.out.println(i);
            }
        }



        }
    }



