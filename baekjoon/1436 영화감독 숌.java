import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        int movie = 0;
        int num = 0;
        while(num != N){
            movie++;
            int temp = movie;

           while(temp != 0){
               if(temp %1000 == 666){
                   num++;
                   break;
               }
               else temp/=10;
           }
        }
        System.out.print(movie);
    }
}

/* 
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
 
		int num = 666;
		int count = 1;
        
		while(count != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
	}
}
다른 사람의 풀이인데 String.valueOf(num).contains("666")은 num값을 String 으로 변환한후 "666"이라는 값이 포함되어있는지를 확인하고 포함 되어있다면 count++값이 올라간다 .
이때 올라간다 count 값이 N과 같을때 num 값을 출력하면 된다 .
