import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int iter = 0;
        List<Integer> list = new ArrayList<>();
        int length = arr.length;
        
        while(iter < length){
            if(list.isEmpty()){
                list.add(arr[iter]);
            }else{
                int lastIdx = list.size() - 1;
                if(list.get(lastIdx) == arr[iter]){
                    list.remove(lastIdx);
                }else{
                    list.add(arr[iter]);
                }
            }
            iter++;
        }
        
        if(list.isEmpty()) return new int[] {-1};
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}