import java.util.*;
 
public class Main {
    static char map[][] = new char[101][101];
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = 0, V = 0;
 
        for (int i = 0; i < N; i++) {
            String s[] = sc.next().split("");
            for (int j = 0; j < s.length; j++) {
                map[i][j] = s[j].charAt(0);
            }
            map[i][N] = 'X';
            map[N][i] = 'X';
        }
 
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                H += (map[i][j] == '.' && map[i][j + 1] == '.' && map[i][j + 2] == 'X') ? 1 : 0;
                V += (map[j][i] == '.' && map[j + 1][i] == '.' && map[j + 2][i] == 'X') ? 1 : 0;
            }
        }
 
        System.out.println(H + " " + V);
 
        sc.close();
    }
}
