import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();  //속도를 줄여준다
        for(int i = 0 ; i<N; i++){
            set.add(br.readLine());
        }
        ArrayList<String> rest = new ArrayList<>();
        for(int i = 0; i<M; i++){
            String str = br.readLine();
            if(set.contains(str)){
                rest.add(str);
            }
        }
        Collections.sort(rest); //사전 순서

        System.out.println(rest.size());
        for(int i = 0; i<rest.size(); i++){
            System.out.println(rest.get(i));  //get을 통해 하나씩 출력
        }


    }

}
