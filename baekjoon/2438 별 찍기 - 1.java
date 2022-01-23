import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();

        for(int i = 1; i <=N ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*"); //println은 개행문자가 포함되어 있어 자동으로 넘어간다...
            }
            System.out.println();
        }
    }
}
