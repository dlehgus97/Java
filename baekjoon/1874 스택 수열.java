//scanner 사용시 

import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); //StringBuilder로 하지 않게 되면 NO일때 NO 이전"+',"-" 값이 츨력이 된다. 

        Stack <Integer> stack = new Stack<>();

        int N = sc.nextInt();

        int start = 0;

        while(N-->0){

            int value = sc.nextInt();
            if(value> start){

                for(int i = start+1 ; i<= value; i++){      //이전 스택에 해당하는 값을 그래로 기억하고 사용하기 위해 
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = value;
            }


            else if(stack.peek() != value){   //stack.peek()가 아니면 그 아래 stack으로 가면서 지워진다. 따라서 뒤에서 나올수가 없다.
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.print(sb);


    }
}

//BufferReader 사용 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); //StringBuilder로 하지 않게 되면 NO일때 NO 이전"+',"-" 값이 츨력이 된다.

        Stack <Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        int start = 0;

        while(N-->0){

            int value = Integer.parseInt(br.readLine());
            if(value> start){

                for(int i = start+1 ; i<= value; i++){      //이전 스택에 해당하는 값을 그래로 기억하고 사용하기 위해
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = value;
            }


            else if(stack.peek() != value){   //stack.peek()가 아니면 그 아래 stack으로 가면서 지워진다. 따라서 뒤에서 나올수가 없다.
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.print(sb);


    }
}
