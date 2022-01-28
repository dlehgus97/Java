import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] age1, String[] age2) {
                return Integer.parseInt(age1[0]) - Integer.parseInt(age2[0]);


            }
        });
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);

        }
    }
}

/*Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] age1, String[] age2) {
                return Integer.parseInt(age1[0]) - Integer.parseInt(age2[0]);


            }
        });
        
        기본적인 순서는 입력순이지만 여기서는 나이를 비교한후 작은것부터 오름차순으로 정렬된다. 나이가 같은것은 기본적으로 입력순으로 정렬된다. 
        return을통해 두수의 차이를 구하고 이를통해 sort를 해주는 기능이다 .
        @Override를 해주고  Arrays.sort( <- 이거에 해당하는 소괄호를 마지막에 붙여준다 );
     
