import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

       int x = sc.nextInt();
       int y = sc.nextInt();

       int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};
       String [] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

       int result = y;
       for(int i = 0 ; i<x-1; i++){
           result += month[i];
       }
       System.out.print(day[result%7]);




    }


}
