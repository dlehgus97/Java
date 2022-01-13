import java.util.Scanner;

public  class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //입력받을 개수 
        int max = 0;    //최대값을 나눠줘야 하기떄문에 설정
        int total = 0;
        int num;
        for(int i = 0; i<N; i++){
            num = sc.nextInt();
            total+= num;
            if(num>max){        //반복문에서 max값보다 큰값이 max가 된다.
                max = num;
            }
        }
        sc.close();
        double avg = 0;
        avg = total *100.0/max/N; //전체합에서 100을 곱해주고 최대값을 나눠주고 평균을 구해주면 된다.
        System.out.println(avg);
    }
}
