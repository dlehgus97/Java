import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        String s = sc.next();
        long r = 1;
        int mod = 1234567891;
        long result =0;
        for(int i = 0; i<L ; i++){
            result += (((s.charAt(i) - 96)*r)%mod);
            r = (r*31)%mod;

                }
        System.out.print(result%mod);
            }
        }

//이 문제는 게속 결과값까지 mod로 나눠줘야한다. 그렇지 않으면 게속 50점이 나오게 된다.
//처음 고려한 부분은 언제까지 mod로 나눠줘야하는지와 Math.pow()를 사용하지 않고 
//제곱을 표현해야하는 부분이였다. 31의 제곱을 이기때문에 r =1로 설정해놓고 r = (r*31)을 L만큼 반복하면 되는걸로 해결했고 
//mod값은 구글링을 통해 해결하였다. 결국 (s.charAt(i) - 96)*r , (r*31) 에 mod값을 나눠줘야하고 당연하게도 result 값에도 나눠줘야하는 해결책이였다 .
