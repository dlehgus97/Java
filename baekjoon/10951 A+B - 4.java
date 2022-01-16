import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);


        while(in.hasNextInt()){  //EOF! 이므로 작성해주어야한다. 
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a+b);
        }
        in.close();
    }

}
