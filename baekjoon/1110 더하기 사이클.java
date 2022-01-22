import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int num =0;
        int same = N;
        int count = 0;
        while(true){
            num= (N/10 + N%10);
            N = ((N%10)*10)+ (num%10) ;
            count++;
            if(N==same)
                break;

        }
        System.out.print(count);
    }


}
