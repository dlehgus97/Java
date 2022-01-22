import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int day =(V - B) / (A - B);

        if ((V- B) % (A - B) != 0){
            day++;
        }

        System.out.println(day);



    }
}

/*Scaneer로 푸니까 시간초과가 나는 문제이다 .java 8에서는 된다니까 일단 넘어가지만 import java.io.BufferedReader; import java.io.IOException;을 사용하는 방법을 공부해서 컴파일 시간을
줄여야 할듯하다.
달팽이 문제는 머리로 풀면 쉽지만 막상 코드르 나타내려니까 난감했다. (V - B) / (A - B) 를 통해 day를 구했다. 이식을 생각하기 위해서는
달팽이가 V에 딱 맞게 떨어질 경우와 아닐 경우를 생각해서 코드를 작성해야한다 .
딱 떨어진다는 경우를 수식으로 작성하게 되면  V= (A-B) + ....(day-1)(A-B) +A 형태가 되고 이식을 정리하면 V = (day-1)*(A-B) + A가 된다 .
따라서 day = V-A/A-B가 된다 . 이렇게 수식으로 작성했지만 쉽게설명하면 달팽이가 하루에올라가고 내려가면 A-B가 되는데 A-B 씩 올라가다가 마지막날 A만큼 올라간것이다 .
반면에 딱 맞게 떨어지지 않을경우는 한번 올라가야 맞게 떨어진다 . 그래서 +1을 해주면 된다 .

