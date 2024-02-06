import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static Trie root;
    static int answer;

    static class Trie{
        Trie[] child;
        boolean isEnd;

        Trie(){
            child = new Trie[26];
            isEnd = false;
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        root = new Trie();

        for(int n=0; n<N; n++){
            String str = br.readLine();
            Trie current = root;
            int index = 0;
            for(int i=0; i<str.length(); i++){
                index = str.charAt(i) - 'a';
                if(current.child[index] == null){
                    current.child[index] = new Trie();
                }
                current = current.child[index];
            }
            current.isEnd = true;
        }

        for(int m=0; m<M; m++){
            String str = br.readLine();
            Trie current = root;
            int index = 0;
            for(int i=0; i<str.length(); i++){
                index = str.charAt(i) - 'a';
                if(current.child[index] == null){
                    current = current.child[index];
                    break;
                }
                current = current.child[index];
            }
            if(current != null && current.isEnd) answer++;
        }

        System.out.print(answer);
    }
}
