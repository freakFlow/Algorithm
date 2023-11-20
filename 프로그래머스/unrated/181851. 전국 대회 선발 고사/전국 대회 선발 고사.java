import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Pick> list = new ArrayList<>();
        for(int i=0; i<rank.length; i++){
            if(!attendance[i]) continue;
            list.add(new Pick(i, rank[i]));
        }
        
        Collections.sort(list);
        
        return 10000 * list.get(0).index + 100 * list.get(1).index + list.get(2).index;
    }
    
    class Pick implements Comparable<Pick>{
        int index;
        int rank;
        
        Pick(int index, int rank){
            this.index = index;
            this.rank = rank;
        }
        
        @Override
        public int compareTo(Pick o){
            return rank - o.rank;
        }
    }
}