import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[][] binaryTree;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        binaryTree = new int[N][2];

        for(int n=0; n<N; n++){
            st = new StringTokenizer(br.readLine());
            int index = toNum(st.nextToken());
            for(int i=0; i<2; i++){
                binaryTree[index][i] = toNum(st.nextToken());
            }
        }

        preOrder(0);
        sb.append('\n');
        inOrder(0);
        sb.append('\n');
        postOrder(0);

        System.out.print(sb);
    }

    static void preOrder(int index){
        if(index < 0) return;
        sb.append(toChar(index));
        preOrder(binaryTree[index][0]);
        preOrder(binaryTree[index][1]);
    }

    static void inOrder(int index){
        if(index < 0) return;
        inOrder(binaryTree[index][0]);
        sb.append(toChar(index));
        inOrder(binaryTree[index][1]);
    }

    static void postOrder(int index){
        if(index < 0) return;
        postOrder(binaryTree[index][0]);
        postOrder(binaryTree[index][1]);
        sb.append(toChar(index));
    }

    static int toNum(String str){
        if(str.equals(".")) return -1;
        return str.charAt(0) - 'A';
    }

    static char toChar(int num){
        return (char)('A' + num);
    }
}
