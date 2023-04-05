import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    
    static int N, d, k, c;
    static int[] sushi;
    static int[] counts;
    static Queue<Integer> queue = new ArrayDeque<>();
    static int cnt;
    static int max;
    
    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        
        sushi = new int[N+k];
        for(int i=0; i<N; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<k; i++) {
        	sushi[N+i] = sushi[i];
        }
        
        counts = new int[d+1];
        // 초기 위치 잡기
        for(int i=0; i<k; i++) {
        	queue.offer(sushi[i]);
        	counts[sushi[i]]++;
        	if(counts[sushi[i]] == 1) {
        		cnt++;
        	}
        }
        max = Math.max(max, (counts[c] == 0) ? cnt + 1 : cnt);
        
        if(max == k+1) {
        	sb.append(max);
        }else {
        	for(int i=k; i<sushi.length; i++) {
        		int head = queue.poll();
        		counts[head]--;
        		if(counts[head] == 0) cnt--;
        		queue.offer(sushi[i]);
        		counts[sushi[i]]++;
        		if(counts[sushi[i]] == 1) {
        			cnt++;
        		}
        		max = Math.max(max, (counts[c] == 0) ? cnt + 1 : cnt);
        		if(max == k+1) break;
        	}
        	
        	sb.append(max);
        }
        
        System.out.println(sb);
    }
    

}