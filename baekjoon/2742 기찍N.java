import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
        
		
        
		 for( int i =N ; i > 0 ; i-- ) {
			System.out.println(N);
             N--;
		}
	}
}
 
