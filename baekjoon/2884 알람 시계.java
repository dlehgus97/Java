import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();

        in.close();

        if(M<45){
            if(H == 0){
                H =  23;
            }
            else
                H -=1;
            M = (60 + (M-45));

        }
        else{
            M = (M-45);}

        System.out.print(H +" "+ M);
    }

}




