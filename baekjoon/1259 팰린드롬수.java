import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true){
            String s = sc.nextLine();
            String r = s;
            StringBuffer sb = new StringBuffer(s);
            String reverse_result = sb.reverse().toString();
            if (s.equals("0"))
                break;
            if(r.equals(reverse_result)){
                System.out.println("yes");
            }
            else System.out.println("no");


                }
            }
        }

/* 이 문제는 출력값이 게속다르게 나오고 break;를 했는데도 게속 출력 되길래 구글링을 해서 풀었다.. 문제점은 바로 equals()메소드를 사용안하고 == 연산자를 사용해서 였다
==연산자와 equals()메소드는 차이를 가지고 있는데  == 연산자는 비교하고자 하는 두개의 대상의 주소값을 비교하는데 반해 
String클래스의 equals 메소드는 비교하고자 하는 두개의 대상의 값 자체를 비교한다는 것이다 .
String은 일반적인 타입이 아니라 클래스이고 클래스는 기본적으로 Call by Reference형태로 생성 시 주소값이 부여됩니다. 
그렇기에 String타입을 선언했을때는 같은 값을 부여하더라도 서로간의 주소값이 다르게 나타난다.
그런데 게속 == 연산자를 사용하여 다른 주소값을 비교 했기때문에 원하는 결과를 얻을 수 없었다 .. 
주의 할 것 



출처 https://coding-factory.tistory.com/536 [Java] 문자열 비교하기 == , equals() 의 차이점

*/
