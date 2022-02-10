class Solution {
    public boolean solution(String s) {  
        if(s.length() == 4 || s.length() == 6){
            for(int i =0 ; i<s.length(); i++){
                char word = s.charAt(i);
                if(word<'0'||word>'9')
                    return false;
            }
            return true;
        }
        else return false ;
    }
}


//다른 사람 풀이 
class Solution {
  public boolean solution(String s) {
      if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);  //문자열을 int형으로 바꿔준다
              return true;                  //true가 된다.
          } catch(NumberFormatException e){//NumberFormatExceptio은 문자열로 바꾸어 주었을때 문자열에 정수로만 이루어진게 아니게되면 생기는 오류이다.
              return false;                 //그 오류를 생겼을떄 false로 바꾸어주게된다. 
          }
      }
      else return false;          //최초에 if조건문 해당하지않으면 false 
  }
}
