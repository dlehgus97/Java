import java.util.*;

public class Solution {
    public int solution(int n) {
        int result = 0;
       while(n>0){
           result +=n%10;
           n /=10;
           
       }
        return result;
    }
}

//다른 풀이 

import java.util.*;
 
public class Solution {
    public int solution(int n) {
        String s = String.valueOf(n);
        int answer = 0;
        
        for (int i = 0; i < s.length() ; i++) {
            answer += Integer.parseInt(s.substring(i, i+1));
        }
 
        return answer;
    }
}
