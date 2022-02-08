import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
       

        for(int i = 0; i<m; i++){
            for(int j = 0 ; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

/*import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i<m; i++){
            for(int j = 0 ; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}*/
