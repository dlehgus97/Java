import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for (long i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long result = 1;
            long N = Long.parseLong(st.nextToken());
            long M = Long.parseLong(st.nextToken());

            for (long k = 0; k < N; k++) {
                result *= M-k;
                result/= k+1;
            }
            System.out.println(result);

        }
    }
}
