import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        String a = "0";
        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if (s.contains("push")) {
                String num[] = s.split(" ");
                queue.add(Integer.parseInt(num[1]));
                a = num[1];
            } else if (s.equals("pop")) {
                if (queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(queue.remove());
            } else if (s.equals("size")) {
                System.out.println(queue.size());
            } else if (s.equals("empty")) {
                if (queue.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            } else if (s.equals("front")) {
                if (queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(queue.peek());
            } else if (s.equals("back")) {
                if (queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(a);
            }


        }

    }
}
/*Queue<Integer> queue = new LinkedList<Integer>();

queue.add(num); // 해당 큐 맨 뒤에 값 삽입 값 추가 성공 시 true 반환 큐가 꽉 찬 경우 IllegalStateException 에러 발생
queue.remove(); // 큐 맨 앞에 있는 값 반환 후 삭제
큐가 비어 있는 경우 NoSuchElementException 에러 발생
queue.size(); // 스택의 size
queue.isEmpty(); // 스택의 Empty
queue.element() //큐의 맨 앞에 있는 값 반환
큐가 비어 있는 경우 NoSuchElementException 에러 발생
queue.peek(); // peek()는 먼저 넣은 것들(head)를 하나씩 반환하지만, 삭제하지 않는다 큐가 비어있을 경우 null 반환
queue.poll(); // poll()은 먼저 넣은 것들(head)부터 하나씩 반환하고, 그것을 삭제한다 큐가 비어있을 경우 null 반환*/
