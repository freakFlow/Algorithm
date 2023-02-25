import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int[] posx = new int[4];
	static int[] posy = new int[4];
	static int idx1, idx2;
	
	public static void main(String[] args) throws IOException {
		
		for(int i=0; i<2; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<4; j++) {
				if(j % 2 == 0) {
					posx[idx1++] = Integer.parseInt(st.nextToken());
				}else {
					posy[idx2++] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		Arrays.sort(posx);
		Arrays.sort(posy);
		
		sb.append((int)Math.pow(Math.max(posx[3] - posx[0], posy[3] - posy[0]), 2));
		
		System.out.println(sb);
	}
	
}