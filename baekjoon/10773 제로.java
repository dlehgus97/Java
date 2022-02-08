//방법 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> s = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int [] arr = new int[N];
        for (int i= 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] != 0) {
                s.push(arr[i]);
                sum += s.peek();
            }
            else
            sum -= s.peek();
            s.pop();
        }
        System.out.println(sum);
    }
}

//방법 2 
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();

        int N = sc.nextInt();
        int sum = 0;
        int [] arr = new int[N];
        for(int i= 0; i<N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] != 0) {
                s.push(arr[i]);
                sum += s.peek();
            }
            else
            sum -= s.peek();
            s.pop();            
        }
        System.out.print(sum);
    }
}

