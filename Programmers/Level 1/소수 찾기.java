class Solution { 
    public int solution(int n) { 
        int answer = 0; 
        for(int i = 2; i <= n; i++){ 
            boolean check = true; 
           for(int j = 2; j*j <= i; j++){
               if(i % j == 0){ 
                   check = false; 
                   break; 
               } 
           } 
            if(check){ 
                answer++; } 
        } return answer; 
    } 
}

//참고용 제작 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int result = 0;

        for(int i = 2; i<=a; i++){
            boolean check = true;
            for(int j = 2; j*j<=b; j++){
                if(i%j == 0){
                    check =false;
                    break;
                }
            }
            if(check){
                answer.add(i);
                result++;

            }
        }
        System.out.println(answer);
        System.out.println(result);
        //System.out.println(answer.size());
    }
}
