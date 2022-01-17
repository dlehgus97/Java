import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int num = 0;


        while(A > 0 || B >0 ){
            A -=C;
            B -=D;
            num +=1;
        }
        System.out.println(L-num);
    }
}
