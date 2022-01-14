import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for(int i = 0 ; i<T; i++){
            int R = in.nextInt();
            String S = in.next(); // nextLine() 으로 실행 했을때 3과 ABC사이에 있는 공백까지 출력이 된다. 따라서 next()로 출력한다
            for(int j = 0 ; j<S.length(); j++){
                for(int k = 0 ; k <R; k++){
                    System.out.print(S.charAt(j));
                }

            }
            System.out.println();
        }
    }

}
//처음에 입력 받을 수 
//입력받은 수만큼 반복되어 입력될 숫자 R과 문자S
//S를 R만큼 반복한다는 반복문 
//S.charAt 문자열에서 특정 위치의 문자(char)를 리턴




