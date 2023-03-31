import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int N, W, H;
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			if(Integer.parseInt(br.readLine()) > Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2))) {
				sb.append("NE");
			}else {
				sb.append("DA");
			}
			sb.append('\n');
		}
			
		System.out.println(sb);
	}
	
}