class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() %2 !=0)
        {
        answer = s.substring(s.length()/2,s.length()/2+1);
            }
        else{
           answer = s.substring(s.length()/2-1, s.length()/2+1);
    }
        return answer;
    }
}
/*substring(int start): start 위치부터 끝까지 문자열 반환

substring(int start, int end): start 위치부터 end 전까지 문자열 반환*/

