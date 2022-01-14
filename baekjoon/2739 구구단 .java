import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 1 ; i <=9; i++){
            System.out.print(N + " * ");
            System.out.print(i + " = ");
            System.out.print(N*i +"\n");
            //System.out.println(N+" * "+i+" = "+(N*i));
        }

    }

}




