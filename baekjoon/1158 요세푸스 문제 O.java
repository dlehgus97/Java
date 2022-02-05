//방법 1
import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();

        for(int i= 1 ;i<=N; i++){
            queue.add(i);
        }
        System.out.print("<");

        while(queue.size()>1){
            for(int i= 1 ; i<K; i++){
                queue.add(queue.poll());
            }

            System.out.print(queue.poll() + ", ");
        }
        System.out.print(queue.poll() +">");
    }
}

//방법 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        for(int i= 1 ;i<=N; i++){
            queue.add(i);
        }
        System.out.print("<");

        while(queue.size()>1){
            for(int i= 1 ; i<K; i++){
                queue.add(queue.poll());
            }

            System.out.print(queue.poll() + ", ");
        }
        System.out.print(queue.poll() +">");
    }
}
