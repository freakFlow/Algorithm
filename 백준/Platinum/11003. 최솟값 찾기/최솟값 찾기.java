import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int L;
    static Deque<Card> deque;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        deque = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            Card card = new Card(i, Integer.parseInt(st.nextToken()));
            while(!deque.isEmpty()){
                if(deque.peekLast().value >= card.value){
                    deque.removeLast();
                }else{
                    break;
                }
            }

            while(!deque.isEmpty()){
                if(deque.peekFirst().index <= card.index - L){
                    deque.removeFirst();
                }else{
                    break;
                }
            }

            deque.addLast(card);

            sb.append(deque.peekFirst().value).append(' ');
        }

        System.out.print(sb);
    }

    static class Card{
        int index;
        int value;

        Card(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
}
