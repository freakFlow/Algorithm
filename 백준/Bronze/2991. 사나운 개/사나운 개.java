import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int[][] dogs = new int[2][2];
	static int[] times = new int[3];
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<dogs.length; i++) {
			for(int j=0; j<dogs[i].length; j++) {
				dogs[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<times.length; i++) {
			times[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<times.length; i++) {
			int barks = 0;
			for(int j=0; j<dogs.length; j++) {
				if((times[i] - 1) % (dogs[j][0] + dogs[j][1]) < dogs[j][0]) barks++;
			}
			
			sb.append(barks).append('\n');
		}
		
		System.out.println(sb);
	}
	
	
}