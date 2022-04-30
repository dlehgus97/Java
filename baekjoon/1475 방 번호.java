import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int [10];//0~9
        String str = br.readLine();
        int result = 0;
        for(int i = 0 ; i<str.length(); i++){
            arr[str.charAt(i)-'0']++;
        }
        int sum = arr[6] + arr[9];
        if(sum%2 == 0 ){
            sum /= 2 ;
        }
        else{
            sum = (sum/2)+1;
        }
        arr[6] = arr[9] = sum;
        for(int i = 0 ; i<str.length(); i++){
            result = Math.max(result, arr[str.charAt(i) - '0']);
        }
        System.out.println(result);
    }

}
