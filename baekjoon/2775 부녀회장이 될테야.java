import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();
      
        int arr [][] = new int[15][15];
        for(int i = 0 ; i<15; i++){
            arr[i][1] = 1;
            arr[0][i] = i;
        }  //고정적으로 정해질 숫자이며 정해진 숫자들의 합을 아래숫자부터 위에 숫자까지 더해주는 개념이다 .

        for(int a = 1; a<15 ; a++){
            for(int b =2; b<15; b++){
                arr[a][b] = arr[a][b-1] + arr[a-1][b];      
            }

        }

       

       for(int i = 0; i<T; i++){
           int k = sc.nextInt();
           int n = sc.nextInt();
           System.out.println(arr[k][n]);
       }
    }

}

/*"a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다" 라는 조건이 있기때문에 구하고자 하는 전체적인 건물의 사람수 알아야한다.
그렇지만 다 구하는 방법보다는 구하고자 하는 a층의 b호의 인원은 [a-1]층의 [b-1]호 까지의 사람수 + [a-1]층 [b]호의 사람수라고 생각할수 있다. 
생각해보면 [a-1]층의 [b-1]호 까지의 사람수는 [a]층의 [b-1]의 사람수와 같다. 그래서  [a-1]층 [b]호의 사람수까지 더해주면 arr[a][b] = arr[a][b-1] + arr[a-1][b] 이 나올수 있게 된다. 
이 문제를 풀때는 다차원 배열을 사용하는게 가장 좋은 풀이인 것 같다.
