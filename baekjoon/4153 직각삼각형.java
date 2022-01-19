import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        while (true) {

           arr[0] = sc.nextInt();
           arr[1] = sc.nextInt();
           arr[2] = sc.nextInt();
           Arrays.sort(arr);
           
           if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
               break;
           }

           if((arr[0]*arr[0]) + (arr[1]*arr[1]) == (arr[2]*arr[2]))
               System.out.println("right");
           else
               System.out.println("wrong");

        }

    }
}


//sort 하기위해 import java.util.Arrays;로 배열을 사용하였다. 그점만 유의 
