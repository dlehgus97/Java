import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int [] arr = new int[N];
                int result = 0;
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		dfs(0, 0);
               if(S==0)
                 S = result - 1;
               else 
                 S = result;
               
		System.out.println(S);

	}

	private static void dfs(int num, int sum) {
		if (num == N) {
			if (sum == S)
				result++;
			return;
		}

		dfs(num + 1, sum + arr[num]);
		dfs(num + 1, sum);
	}
}
