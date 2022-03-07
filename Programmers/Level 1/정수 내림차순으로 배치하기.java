import java.util.*;

class Solution {
    public long solution(long n) {
      
        String word = Long.toString(n);
        
        
        String[] arr = word.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        
        word= String.join("", arr);
        
        
        long answer = Long.parseLong(word);
 
        return answer;
    }
}
