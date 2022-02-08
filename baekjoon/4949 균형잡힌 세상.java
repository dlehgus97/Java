import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();  //

        while (true) {
            String s = br.readLine();
            if (s.equals(".")) {
                break;
            }
            
            for (int i = 0; i < s.length(); i++) {
                char word = s.charAt(i);
                
                if (word == '(' || word == '[') {
                    stack.push(word);
                } 
                else if (word == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        stack.push(word);
                    } 
                    else
                        stack.pop();
                } 
                else if (word == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        stack.push(word);
                    } 
                    else
                        stack.pop();
                }
            }
                if (!stack.isEmpty())
                    System.out.println("no");
                else
                    System.out.println("yes");
                stack.clear();
            }
        }
    }

/*stack에 게속해서 추가를 해주는데 결국 마지막에 pop을 통해 다 없어지게 해준다.
결국 남아있다는 말은 짝이 안 맞다는 의미 
while에서 입력받기 때문에 stack.clear()를 통해 다 없애주고 다시 입력 받는다 .*/ 

