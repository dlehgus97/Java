//BufferedReader 를 사용하는 방식 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int count = 0;
        int result = 0;

        for(int i = 0; i <N; i++){
            int num = Integer.parseInt(st.nextToken());
            for(int j  = 1; j<num; j++ ){
                if(num%j ==0){
                    count++;
                }
            }
            if(count == 1) {
                result++;
            }
                count = 0;


        }

        System.out.print(result);
    }
}

//Scanner 를 사용하는 방법

import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;
        int result = 0;

        for(int i = 0; i <N; i++){
            int num = sc.nextInt();
            for(int j  = 1; j<num; j++ ){
                if(num%j ==0){
                    count++;
                }
            }
            if(count == 1) {
                result++;
            }
                count = 0;


        }

        System.out.print(result);
    }
}
