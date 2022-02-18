import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		
		int map[][]=new int[h][w];
		for(int y=0;y<h;y++) {
			st=new StringTokenizer(br.readLine());
			for(int x=0;x<w;x++) {
				map[y][x]=Integer.parseInt(st.nextToken());
			}
		}
		int k=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<k;i++) {
			st=new StringTokenizer(br.readLine());
			int y1=Integer.parseInt(st.nextToken())-1;
			int x1=Integer.parseInt(st.nextToken())-1;
			int y2=Integer.parseInt(st.nextToken())-1;
			int x2=Integer.parseInt(st.nextToken())-1;
			int sum=0;
			for(int y=y1;y<=y2;y++) {
				for(int x=x1;x<=x2;x++) {
					sum+=map[y][x];
				}
			}
			sb.append(sum+"\n");
		}
		System.out.println(sb.toString());
	}
}
