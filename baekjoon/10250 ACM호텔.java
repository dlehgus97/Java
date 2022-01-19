import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0 ; i<T; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

           
            int Floor = N % H;
            int Hosu = (N/H) +1;

            if(Floor == 0){
                Floor = H;
                Hosu = N/H;
            }

            int sum = (Floor*100) + Hosu;



            System.out.println(sum);
        }
    }
}


// 나머지를 이용한 계산이기때문에 나머지가 없을때도 계산 해주어야 한다 .
