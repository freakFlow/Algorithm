import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int h1, m1, s1, h2, m2, s2;
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine(), ":");
		h1 = Integer.parseInt(st.nextToken());
		m1 = Integer.parseInt(st.nextToken());
		s1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), ":");
		h2 = Integer.parseInt(st.nextToken());
		m2 = Integer.parseInt(st.nextToken());
		s2 = Integer.parseInt(st.nextToken());
		
		s2 -= s1;
		if(s2 < 0) {
			s2 += 60;
			m2--;
		}
		
		m2 -= m1;
		if(m2 < 0) {
			m2 += 60;
			h2--;
		}
		
		h2 -= h1;
		if(h2 < 0) {
			h2 += 24;
		}
		if(h2 == 0 && m2 == 0 && s2 == 0) {
			h2 = 24;
		}
		sb.append(String.format("%02d:%02d:%02d", h2, m2, s2));
			
		System.out.println(sb);
	}
	
}