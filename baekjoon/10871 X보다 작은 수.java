import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int A = in.nextInt();
		int B = in.nextInt();
		int arr[] = new int[A];
        
		for (int i = 0; i < A; i++) {
			arr[i] = in.nextInt();
		}
 
		in.close();
        
		for (int i = 0; i < A; i++) {
			if (arr[i] < B) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
