import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =  sc.nextInt();
        int B =  sc.nextInt();
        int result_1 = 0;
        int result_2 = 0;

        result_1 =  (A %10) * 100 + ((A/10)%10)*10 + (A/100);
        result_2 =  (B %10) * 100 + ((B/10)%10)*10 + (B/100);

        if (result_1 >result_2)
            System.out.println(result_1);
        else if(result_1<result_2)
            System.out.println(result_2);


    }
}


  /*A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B);*/

/*다른 방법을 검색해보니 StringBuilder() 을 사용한 방법을 보았음 reverse() 메소드를 가지고 있기 때문에 훨씬 편리하게 사용가능하다 .
new StringBilder()를 만들어 타입을 변경시주고  append()로 넣어진 값을 StringBuilder() 가 되고 reverse()을 통해 반대로 바꿔주고 StringBuilder 타입을 문자열로 반환시키기 위해 toString()을 사용해준다 .
마지막으로 Integer.parseInt()를 사용해 다시 int(정수형)으로 바꿔준다. */

/*삼항 연산자를 자주 사용안하다본니 개념이 무뎌지는 것 같다. 삼항연산자는 (조건문) : ? 참 : 거짓 이라는 의미이기때문에 2908 상수에서는 A>B 이면 A  A<B B 출력 한다. */ 
