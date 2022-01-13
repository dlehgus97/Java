import java.util.Scanner;

public class algorithm {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        int result = 0;
      
        for(int i= 0; i<5; i++){
            int a = sc.nextInt();
            result += a*a;
        }
      
        System.out.println(result%10);
    }

}
