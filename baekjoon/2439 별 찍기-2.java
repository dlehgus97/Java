import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
    for(int i =0; i<N; i++){
        for(int j =0; j<N-i-1; j++){
            System.out.print(" ");
        }
        for(int j =0 ; j<=i; j++){
            System.out.print('*');
            }
        System.out.println();
        }

    }
}

//방법 2 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<= n ; i++) {
            for (int j=n; j>i; j--) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
                System.out.println();

            sc.close();
        }
    }
}
