import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        long a = 0;
        long b = 1;
        long c = 1;
        for(int i = 0; i<N-1; i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }

}

//2747에서 범위만 바뀐것 

