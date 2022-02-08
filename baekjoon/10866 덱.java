import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> dequeue = new ArrayDeque<Integer>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if (s.contains("push_front")) {
                String num[] = s.split(" ");
                dequeue.addFirst(Integer.parseInt(num[1]));

            }
            else if(s.contains("push_back")){
                String num[] = s.split(" ");
                dequeue.addLast(Integer.parseInt(num[1]));
            }
            else if (s.equals("pop_front")) {
                if (dequeue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(dequeue.pollFirst());
            }
            else if (s.equals("pop_back")) {
                if (dequeue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(dequeue.pollLast());
            }
            else if (s.equals("size")) {
                System.out.println(dequeue.size());
            }
            else if (s.equals("empty")) {
                if (dequeue.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            else if (s.equals("front")) {
                if (dequeue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(dequeue.peekFirst());
            }
            else if (s.equals("back")) {
                if (dequeue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(dequeue.peekLast());
            }


        }

    }
}
/*
 ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

duque.add() => 마지막에 원소 삽입 / offer이랑 똑같지만 add는 용량 초과 시 예외 발생 offer 는 삽입 성공 시 true, 용량 제한에 걸리는 경우 false 반환
deque.addFirst(i); => 맨 앞에 넣기
deque.addLast(i); =>맨 뒤에 넣기
deque.pollFirst(); => 맨 앞 빼기
deque.pollLast(); => 맨 뒤 빼기
deque.peekFirst(); => 맨 앞 리턴
deque.peekLast(); => 맨 뒤 리턴
duque.getFirst(); =>맨 앞의 원소를 리턴 덱이 비어있는 경우 예외 발생*/
