import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[42];
        int a;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            a = sc.nextInt();
            arr[a % 42] = 1;

        }
        for (int j = 0; j < 42; j++) {
            if (arr[j] == 1) {
                result++;

            }

        }
        System.out.println(result);
    }
}


/*arr[a%42] = 1이라는 값을 설정하여 1일때 result값이 하나식 증가하는 구조를 만들것이다. 그렇게 되면 똑같은 수가 되어도 그대로 다시 1을 대입하기때문에 결국은 1값만 추가하면된다.1씩 
++하는 구조가 아니라는걸 잘 확인 하여야한다.*/
