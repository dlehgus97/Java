import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s;
        int score = 0;
        int result = 0;


        for(int i = 0; i< N; i++){
            s = sc.next();

            for(int j = 0; j<s.length(); j++){
                if(s.charAt(j) =='O'){
                    score +=1;
                    result += score;
                }

                else{
                    score = 0;
                }
            }
               System.out.println(result);
            result = 0;
            score = 0;

        }


    }
}


/* 처음에는 score 가 마지막에 O일때 다음 score로 넘어가는것을 고려 하지 못했다... 
그래서 result값과 같이 score 값을 0으로 맞춰줬다.
생각해보면 차라리 첫번째 for 문에 int result = 0; int score = 0 ; 을 설정하면 
마지막에 0으로 초기화 할 필요가 없는걸 알게 되었다 .. 
수정하자면 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s;
        


        for(int i = 0; i< N; i++){
            	s = sc.next();
		int score = 0;
       		int result = 0;
            for(int j = 0; j<s.length(); j++){
                if(s.charAt(j) =='O'){
                    score +=1;
                    result += score;
                }

                else{
                    score = 0;
                }
            }
               System.out.println(result);
           

        }


    }
}

