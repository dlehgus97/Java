import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String S = sc.nextLine();

       for(char a = 'a'; a<='z'; a++){
           int word = S.indexOf(a);
           System.out.print(word + " ");

        }

    }
}


//indexOf(); 를 사용하였다 . indexOf는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며 만약 찾지 못했을 경우 "-1"을 반환한다.

// 두번째 방법
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String S = sc.nextLine();

       int [] arr = new int [26];

       for(int i = 0 ; i<arr.length; i++){
           arr[i] = -1; //처음에 전체를 -1로 설정해놓는다 .

       }
       for(int i = 0; i <S.length(); i++   ){
           char word  = S.charAt(i);
           if(arr[word - 'a'] == -1){
               arr[word -'a'] = i;
           }

       }
       for(int i = 0 ; i<arr.length; i++)
        System.out.print(arr[i] + " ");

    }
}


//배열을 출력할때 import java.util.Arrays; 를 추가해서 System.out.print(Arrays.toString(arr));를 사용하려 하였다. 출력값에 [출력값] 형태로 나오다 보니 
//그냥 반복문으로 출력해야겠다 해서 바꾼 방법
//상황에 맞는 방법을 찾아서 공부 할 것 ...




