// 방법 1 Queue를 이용한 방법
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i =1 ; i<=N ;i++){
            queue.add(i);
        }
        while(queue.size()>1){
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.peek());

    }
}

//방법 2 다른방법(참고한 풀이)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] result = new int[N*2];

        for(int i =1; i<=N; i++){
            result[i] = i;
        }
        int first_num = 1;
        int last_num = N;

        while(N-- >1){
            first_num += 1;
            result[last_num+1] = result[first_num];
            last_num +=1 ;
            first_num += 1; //지워질 숫자 
        }
        System.out.println(result[first_num]);

    }
}
