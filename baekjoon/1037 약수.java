import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] arr = new int[count];
		
		for(int i=0;i<count;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
	
		int max = arr[count-1];
		
		
		int min = arr[0];
		
		System.out.println(max*min);
	}
}
