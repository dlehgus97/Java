import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();



        int s = 0 ;
        int M = Integer.parseInt(br.readLine());


        while (M-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            int num;

            switch (word){
                case "add" :
                    num = Integer.parseInt(st.nextToken());
                    s |= (1<<(num-1));
                    break;

                case "remove" :
                    num =Integer.parseInt(st.nextToken());
                    s &= ~(1<<(num-1));
                    break;

                case "check" :
                    num = Integer.parseInt(st.nextToken());
                    sb.append((s& (1 << (num - 1))) != 0 ? "1\n" : "0\n");
                    break;

                case "toggle" :
                    num = Integer.parseInt(st.nextToken());
                    s ^= (1 << (num-1));
                    break;
                case "all" :
                    s = (1 << 21) - 1;
                    break;

                case "empty" :
                    s = 0;
                    break;

            }
        }
        System.out.println(sb);
    }
}

//비트마스크 문제이다 . 코테를 위해 더 공부해야할듯 
