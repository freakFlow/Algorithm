import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        int length = arr.length;
        while(i < length){
            int size = list.size();
            if(size == 0){
                list.add(arr[i++]);
            }else{
                int lastElement = list.get(size - 1);
                if(lastElement < arr[i]){
                    list.add(arr[i++]);
                }else{
                    list.remove(size - 1);
                }
            }
        }
        
        int endSize = list.size();
        int[] stk = new int[endSize];
        for(int j=0; j<endSize; j++){
            stk[j] = list.get(j);
        }
        
        return stk;
    }
}