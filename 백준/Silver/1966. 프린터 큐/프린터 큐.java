import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int tc;
	static int N, M;
	static Queue<Document> queue = new ArrayDeque<>();
	static int[] counts;
	
	public static void main(String[] args) throws IOException{
		
		tc = Integer.parseInt(br.readLine());
		for(int t=0; t<tc; t++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			counts = new int[10];
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				int importance = Integer.parseInt(st.nextToken());
				counts[importance]++;
				queue.offer(new Document(i, importance));
			}
			
			int cnt = 0;
			Outer:while(!queue.isEmpty()) {
				Document head = queue.poll();
				// 현재 문서보다 중요도가 높은 문서가 있는지 확인
				for(int i=counts.length-1; i>head.importance; i--) {
					if(counts[i] > 0) {
						queue.offer(head);
						continue Outer;
					}
				}
				// 출력 가능
				counts[head.importance]--;
				cnt++;
				if(head.idx == M) break;
			}
			queue.clear();
			sb.append(cnt).append('\n');
		}
		
		System.out.println(sb);
	}
	
	static class Document{
		int idx;
		int importance;
		
		Document(int idx, int importance){
			this.idx = idx;
			this.importance = importance;
		}

	}
}