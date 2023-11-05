import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int length = arr.length;
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        
        for(int i=0; i<length; i++){
            int num = arr[i];
            if(flag[i]){
                int iter = num * 2;
                for(int j=0; j<iter; j++){
                    list.add(num);
                }
                idx += iter;
            }else{
                for(int j=0; j<num; j++){
                    list.remove(--idx);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}