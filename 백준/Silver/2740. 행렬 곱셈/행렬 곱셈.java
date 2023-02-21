import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int N, M, K;
	static int[][] matA, matB;

	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		matA = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				matA[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		st.nextToken();
		K = Integer.parseInt(st.nextToken());
		matB = new int[M][K];
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<K; j++) {
				matB[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<K; j++) {
				int sum = 0;
				for(int k=0; k<M; k++) {
					sum += matA[i][k] * matB[k][j];
				}
				sb.append(sum).append(' ');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
	
	
}