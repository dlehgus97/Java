class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int arr = x;
        int result = 0;
        
        while(arr>0){
            result += arr%10;
            arr /= 10;
        }
        
        if(x%result !=0){
        answer = false;
        }
         return answer;
    }
}
