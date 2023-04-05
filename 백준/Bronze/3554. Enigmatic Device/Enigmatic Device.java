import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int n;
	static int m;
	static int[] inputs;
	
	public static void main(String[] args) throws IOException {
		
		n = Integer.parseInt(br.readLine());
		inputs = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<inputs.length; i++) {
			inputs[i] = Integer.parseInt(st.nextToken());
		}
		
		m = Integer.parseInt(br.readLine());
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			String oper = st.nextToken();
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			if(oper.equals("1")) {
				for(int j=left; j<=right; j++) {
					inputs[j] = inputs[j] * inputs[j] % 2010;
				}
			}else {
				int sum = 0;
				for(int j=left; j<=right; j++) {
					sum += inputs[j];
				}
				
				sb.append(sum).append('\n');
			}
		}
		
		System.out.println(sb);
	}
	
	
}