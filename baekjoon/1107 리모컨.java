import java.util.*;
public class Main {
	
	static int answer=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		
		int N = sc.nextInt();
		int[] array = new int[10];
		for(int i=0;i<N;i++) {
			array[sc.nextInt()] = 1;
		}
		
		answer = Math.abs(val-100);
		if(array[0]==0) {
			int res = val+1;
			if(res<answer) answer = res;
		}
		
		int length = Integer.toString(val).length();
		recursive(val, "", array, length, 0);	
		System.out.println(answer);
	}
	
	public static void recursive(int val, String num, int[] array, int length, int nowLength) {
		if(num.startsWith("0")) return;
		
		if((nowLength == length-1 || nowLength == length || nowLength == length+1) && num!="" ) {
			int result = Math.abs(Integer.parseInt(num)-val)+nowLength;
			if(result<answer) {
				answer=result;
			}
			if(nowLength==length+1) return;
		}
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==1) continue;
			recursive(val, num+i,array,length,nowLength+1);
		}
	}

}
 
