import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ;i<N; i++){
            String s = br.readLine();

            if(s.contains("push")){
                String num[] =s.split(" "); //push라는 단어가 있으면 추가로 숫자를 입력받는다 .
                stack.push(Integer.parseInt(num[1]));
            }
            else if(s.equals("pop")){
                if(stack.empty())
                    System.out.println(-1);
                else
                    System.out.println(stack.pop());

            }
            else if(s.equals("size")){
                System.out.println(stack.size());
            }
            else if(s.equals("empty")){
                if(stack.empty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            else if(s.equals("top")){
                if(stack.empty())
                    System.out.println(-1);
                else
                    System.out.println(stack.peek());
            }
        }


            }

        }

/* 스택라이브러리를 사용할떄는 
Stack<Integer> s = new Stack<>();

s.push(i); => 값을 넣어준다
s.pop(); =>스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력 
s.size(); => 스택의 크기
s.peek(); => 스택의 가장 위의 값 조회*/
