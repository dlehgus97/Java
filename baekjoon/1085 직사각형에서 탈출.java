import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();
       int w = sc.nextInt();
       int h = sc.nextInt();
       int result_1 = (Math.min(x, y));
       int result_2 = (Math.min(w-x, h-y));
       System.out.println((Math.min(result_1,result_2)));












    }
}


