import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        in.close();
        
        if(N%400 == 0){
            System.out.println(1);
        }
        else if(N%4 == 0 &&N%100 !=0){
            System.out.println(1);
        }
        else if(N % 4 !=0 && N % 100 == 0){
            System.out.println(0);
        }
        else
            System.out.println(0);

    }
}
