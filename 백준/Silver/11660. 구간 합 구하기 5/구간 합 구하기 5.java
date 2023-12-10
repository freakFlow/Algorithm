import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int N, M;
	static int[][] input;
	
	public static void main(String[] args) throws IOException {
		
		N = nextInt();
		M = nextInt();
		
		input = new int[N+1][N+1];
		
		for(int i=1; i<input.length; i++) {
			for(int j=1; j<input[i].length; j++) {
				input[i][j] = nextInt() + input[i-1][j] + input[i][j-1] - input[i-1][j-1];
			}
		}
		
		for(int i=0; i<M; i++) {
			int x1 = nextInt();
			int y1 = nextInt();
			int x2 = nextInt();
			int y2 = nextInt();
			
			sb.append(input[x2][y2] - input[x1-1][y2] - input[x2][y1-1] + input[x1-1][y1-1]).append('\n');
		}
		
		System.out.println(sb);
	}
	
	static final int BUFFER_SIZE = 1<<13; // 8kb?
	static byte[] buffer = new byte[BUFFER_SIZE];
	static int bufferLen, bufferIdx;
	
	static int nextInt() throws IOException {
		int c = 0;
		byte b;
		
		while((b = read()) <= 32) {} // 32 = SP, 0~31 = 제어문자
		do {
			c = (c<<3) + (c<<1) + (b&15);// c<<3 + c<<1 = c*8 + c*2 => c*10, 15 = 0b0000_1111 => 하위 4비트 추출
		}while(isNumber((b=read())));
		
		return c;
	}
	
	static boolean isNumber(byte b) {
		return 47 < b && b < 58; // 48 = 0b0011_0000, 57 = 0b0011_1001
	}
	
	static byte read() throws IOException {
		if(bufferLen == bufferIdx) {// 처음 시작할 때, 버퍼를 다 읽었을 때
			bufferLen = System.in.read(buffer, bufferIdx=0, BUFFER_SIZE);
			if(bufferLen == -1) {// EOF읽었을 때
				buffer[0] = -1;
			}
		}
		return buffer[bufferIdx++];
	}
}