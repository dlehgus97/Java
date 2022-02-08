class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int count = b;
        
        int month[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String Day[] = { "THU", "FRI", "SAT" ,"SUN", "MON","TUE", "WED" };
        
        for(int i = 0 ; i<a-1; i++){
            count += month[i];
        }
        answer = Day[count%7];
          
        return answer;
    }
}
