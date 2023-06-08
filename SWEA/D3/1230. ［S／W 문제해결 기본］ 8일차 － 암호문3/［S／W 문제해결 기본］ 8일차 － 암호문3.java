import java.io.*;
import java.util.*;

public class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static final int TEST_CASE = 10;
	static int N, M;
	static LinkedList<String> llist = new LinkedList<>();
	static String cmd;
	static int x, y;
	
	public static void main(String[] args) throws IOException{
		
		for(int test=1; test<=TEST_CASE; test++) {
			// 원본 암호문
			N = Integer.parseInt(br.readLine());
			llist.clear();
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				llist.add(st.nextToken());
			}
			
			// 명령어 처리
			M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<M; i++) {
				cmd = st.nextToken();
				
				switch(cmd) {
				case "I":
					x = Integer.parseInt(st.nextToken());
					y = Integer.parseInt(st.nextToken());
					for(int j=0; j<y; j++) {
						llist.add(x+j, st.nextToken());
					}
					break;
				case "D":
					x = Integer.parseInt(st.nextToken());
					y = Integer.parseInt(st.nextToken());
					for(int j=0; j<y; j++) {
						llist.remove(x);
					}
					break;
				case "A":
					y = Integer.parseInt(st.nextToken());
					for(int j=0; j<y; j++) {
						llist.add(st.nextToken());
					}
					break;
				}
			}
			
			sb.append('#').append(test).append(' ');
			for(int i=0; i<10; i++) {
				sb.append(llist.get(i)).append(' ');
			}
			
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}