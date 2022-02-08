class Solution {
    public long solution(long num) {
        int answer = 0;
        int count = 0;
        while(num != 1){
            if(num %2 ==0){
                num/= 2;
                count++;
            }
            else if((num%2) != 0){
                num = (num*3)+1;
                count++;
            }
            if(count>500){
                answer = -1;
                
            }
            else {
                answer = count;
            }
        }
        return answer;
    }
}
