import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static double r, t;
	static int n;
	static int tnum;
	
	public static void main(String[] args) throws IOException{
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			r = Double.parseDouble(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			t = Double.parseDouble(st.nextToken());
			if(n == 0) break;
			double distance = (Math.PI * r) * n / (12 * 5280);
			sb.append(String.format("Trip #%d: %.2f %.2f\n", ++tnum, distance, distance / (t / 60 / 60)));
		}
		
		System.out.println(sb);
	}
	
}