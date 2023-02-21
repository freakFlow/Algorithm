import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int N, K;
	static int[] kits;
	static int cnt;

	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		kits = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			kits[i] = Integer.parseInt(st.nextToken());
		}
		
		makePermutation(0, new boolean[N], 500);
		
		sb.append(cnt);
		
		System.out.println(sb);
	}
	
	static void makePermutation(int nth, boolean[] selected, int sum) {
		if(nth == N) {
			cnt++;
			return;
		}
		
		for(int i=0; i<selected.length; i++) {
			if(selected[i]) continue;
			selected[i] = true;
			sum += kits[i] - K;
			if(sum >= 500) {
				makePermutation(nth+1, selected, sum);
			}
			selected[i] = false;
			sum -= kits[i] - K;
		}
	}
}