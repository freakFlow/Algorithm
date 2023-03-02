import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static long[] p, q;
	static boolean isChanged;
	static boolean isInteger = true;
	
	public static void main(String[] args) throws IOException {
		
		p = new long[2];
		q = new long[3];
		
		st = new StringTokenizer(br.readLine());
		p[0] = Long.parseLong(st.nextToken());
		q[0] = Long.parseLong(st.nextToken());
		p[1] = Long.parseLong(st.nextToken());
		q[1] = Long.parseLong(st.nextToken());
		q[2] = 2;
		
		do {
			isChanged = false;
			for(int i=0; i<q.length; i++) {
				for(int j=0; j<p.length; j++) {
					if(q[i] == 1 || p[j] == 1) continue;
					if(q[i] % p[j] == 0) {
						q[i] /= p[j];
						p[j] = 1;
						isChanged = true;
					}
					if(p[j] % q[i] == 0) {
						p[j] /= q[i];
						q[i] = 1;
						isChanged = true;
					}
				}
			}
			
		}while(isChanged);

		for(int i=0; i<q.length; i++) {
			if(q[i] != 1) {
				isInteger = false;
				break;
			}
		}
		
		sb.append((isInteger) ? 1 : 0);
		
		
		System.out.println(sb);
	}
}