import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static final int HOLE = 0, AIR = 2, CHEESE = 1;
	static int R, C;
	static Element[][] pan;
	static Queue<Element> queue = new ArrayDeque<>();
	static int[][] deltas = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		pan = new Element[R][C];
		for(int i=0; i<R; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<C; j++) {
				pan[i][j] = new Element(i, j, Integer.parseInt(st.nextToken()));
			}
		}
		
		flowAir();
		
		int time = 0;
		int cheese = 0;
		List<Element> melting = new ArrayList<>();
		while(true) {
			for(int r=0; r<R; r++) {
				for(int c=0; c<C; c++) {
					if(pan[r][c].type != CHEESE) continue;
					
					for(int d=0; d<deltas.length; d++) {
						int nr = pan[r][c].r + deltas[d][0];
						int nc = pan[r][c].c + deltas[d][1];
						if(isIn(nr, nc) && pan[nr][nc].type == AIR) {
							melting.add(pan[r][c]);
							break;
						}
					}
				}
			}
			
			if(melting.isEmpty()) {
				break;
			}
			
			for(int i=0; i<melting.size(); i++) {
				melting.get(i).type = AIR;
			}
			
			flowAir();
			
			time++;
			cheese = melting.size();
			melting.clear();
		}
		
		sb.append(time).append('\n').append(cheese);
			
		System.out.println(sb);
	}
	
	static void flowAir() {
		queue.offer(pan[0][0]);
		boolean[][] visited = new boolean[R][C];
		visited[0][0] = true;
		
		while(!queue.isEmpty()) {
			Element head = queue.poll();
			if(head.type == CHEESE) continue;
			
			head.type = AIR;
			
			for(int d=0; d<deltas.length; d++) {
				int nr = head.r + deltas[d][0];
				int nc = head.c  + deltas[d][1];
				if(isIn(nr, nc) && !visited[nr][nc]) {
					queue.offer(pan[nr][nc]);
					visited[nr][nc] = true;
				}
			}
		}
	}
	
	static boolean isIn(int r, int c) {
		return r>=0 && r<R && c>=0 && c<C;
	}
	
	static class Element{
		int r, c;
		int type;
		
		Element(int r, int c, int type){
			this.r = r;
			this.c = c;
			this.type = type;
		}
		
	}
}