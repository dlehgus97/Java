import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(max(N,M));
        System.out.println((N*M)/max(N,M));


    }
    public static int max(int a ,int b){
        if(b == 0)
            return a;
        else
            return max(b,a%b);
    }

}

/*방법 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int a = Math.max(N,M);
        int b = Math.min(N,M);

        while(true){
            int tmp = a;
            a = b;
            b = tmp%b;
            if(b==0){
                break;
            }
        }
        System.out.println(a);
        System.out.println((N*M)/a);

    }

}
