import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] sorted = new Integer[numlist.length];
        
        for(int i=0; i<sorted.length; i++){
            sorted[i] = numlist[i];
        }
        
        Arrays.sort(sorted, new Comparator<Integer>(){
           public int compare(Integer o1, Integer o2){
               int diff1 = Math.abs(o1 - n);
               int diff2 = Math.abs(o2 - n);
               if(diff1 == diff2){
                   return o2 - o1;
               }
               
               return diff1 - diff2;
           } 
        });
        
        int[] answer = new int[sorted.length];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = sorted[i];
        }
        
        return answer;
    }
}