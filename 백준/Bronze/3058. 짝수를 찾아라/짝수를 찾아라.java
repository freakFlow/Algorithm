import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static final int SIZE = 7;
	static int T;
	static int num;
	static int sum;
	static int min;
	
	public static void main(String[] args) throws IOException {
		
		T = Integer.parseInt(br.readLine());
		for(int t=0; t<T; t++) {
			st = new StringTokenizer(br.readLine());
			sum = 0;
			min = Integer.MAX_VALUE;
			for(int i=0; i<SIZE; i++) {
				num = Integer.parseInt(st.nextToken());
				if(num % 2 == 0) {
					sum += num;
					if(num < min) {
						min = num;
					}
				}
			}
			sb.append(sum).append(' ').append(min).append('\n');
		}
		
		System.out.println(sb);
	}
	
	
}