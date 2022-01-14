import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int [] arr = new int [10];
        int result = a*b*c;  //int result (in.nextInt() * in.nextInt() * in.nextInt()); 애초에 이렇게 설정해도 될것 ..!

        while(result!= 0){
            arr[result%10] +=1;
            result /=10;
        }
    for(int i = 0; i<10; i++){
    System.out.println(arr[i]);
        }
    }

}




