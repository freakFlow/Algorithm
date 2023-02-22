import java.io.*;
import java.util.*;
 
public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    
    static int T;
    static int H, W;
    static char[][] map;
    static Tank tank;
    
    static int N;
    static String inputs;
    
    static char[] cmds = {'U', 'D', 'L', 'R'};
    static char[] icons = {'^', 'v', '<', '>'};
    static int[][] deltas = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
     
    public static void main(String[] args) throws IOException{
    	
    	T = Integer.parseInt(br.readLine());
    	
    	for(int t=1; t<=T; t++) {
    		st = new StringTokenizer(br.readLine());
        	H = Integer.parseInt(st.nextToken());
        	W = Integer.parseInt(st.nextToken());
        	map = new char[H][W];
        	for(int i=0; i<H; i++) {
        		String input = br.readLine();
        		for(int j=0; j<W; j++) {
        			map[i][j] = input.charAt(j);
        			for(int k=0; k<icons.length; k++) {
        				if(icons[k] == map[i][j]) {
        					tank = new Tank(i, j, map[i][j]);
        				}
        			}
        		}
        	}
        	
        	N = Integer.parseInt(br.readLine());
        	inputs = br.readLine();
        	
        	control();
        	
        	sb.append('#').append(t).append(' ');
        	print();
    	}
    	
         
        System.out.println(sb);
    }
    
    static void print() {
    	for(int i=0; i<map.length; i++) {
    		for(int j=0; j<map[i].length; j++) {
    			sb.append(map[i][j]);
    		}
    		sb.append('\n');
    	}
    }
    
    static void control() {
    	for(int i=0; i<N; i++) {
    		char cmd = inputs.charAt(i);
    		if(cmd == 'S') {
    			tank.shoot();
    		}else {
    			tank.move(cmd);
    		}
    	}
    }
    
    static boolean isIn(int r, int c) {
    	return r>=0 && r<H && c>=0 && c<W;
    }
    
    static class Tank{
    	int[] pos;
    	int[] lookAt;
    	
    	Tank(int x, int y, char lookAt){
    		pos = new int[2];
    		pos[0] = x;
    		pos[1] = y;
    		this.lookAt = Arrays.copyOf(mapCh(lookAt, icons), 2);
    	}
    	
    	void move(char cmd) {
    		lookAt = mapCh(cmd, cmds);
    		
    		int nr = pos[0] + lookAt[0];
    		int nc = pos[1] + lookAt[1];
    		if(isIn(nr, nc) && map[nr][nc] == '.') {
    			map[pos[0]][pos[1]] = '.';
    			pos[0] = nr;
    			pos[1] = nc;
    		}
    		map[pos[0]][pos[1]] = mapIcon(lookAt);
    	}
    	
    	void shoot() {
        	int r = pos[0];
        	int c = pos[1];
        	
        	while(true) {
        		r += lookAt[0];
        		c += lookAt[1];
        		if(!isIn(r, c)) break;
        		
        		if(map[r][c] == '*') {
        			map[r][c] = '.';
        			break;
        		}else if(map[r][c] == '#') {
        			break;
        		}
        	}
        }
    }
    
    static char mapIcon(int[] lookAt) {
    	int idx = 0;
    	for(int i=0; i<deltas.length; i++) {
    		if(deltas[i][0] == lookAt[0] && deltas[i][1] == lookAt[1]) {
    			idx = i;
    			break;
    		}
    	}
    	return icons[idx];
    }
    
    static int[] mapCh(char lookAt, char[] arr) {
    	int idx = 0;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] == lookAt) {
    			idx = i;
    			break;
    		}
    	}
    	return deltas[idx];
    }
}