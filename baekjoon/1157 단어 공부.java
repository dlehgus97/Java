import java.util.Scanner;


public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[26];   //알파벳 개수
        String s = sc.nextLine().toUpperCase();

        for(int i = 0; i<s.length(); i++){
                arr[s.charAt(i) - 'A']++; //각각의 문자 위치에서 해당하는 문자에 -'A'를 해준다/
            }
        int max = 0;
        char word = '?';
        for (int i = 0; i < 26; i++){ //26개를 반복해서 확인한다
            if(max<arr[i]){           //max가 게속해서 바뀌면서 최종 max를 도출한다
                max = arr[i];
                word = (char)(i+65);  //max값에 해당하는 문자의 대문자를 출력학 위해 ex)A이면 0이 더해져서 A에 해당하는 65를 변환해준다.
            }
            else if(max == arr[i]){     //word 값이 전체 ?이 되었다가 max에 해당하는 값이 변경되면 다시 그에 해당하는 max 값이 된다.
                word = '?';
            }
        }
    System.out.println(word);
    }
}
