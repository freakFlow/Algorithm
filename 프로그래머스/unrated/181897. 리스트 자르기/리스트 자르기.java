import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch(n){
            case 1:
                return slice(num_list, 0, b, 1);
            case 2:
                return slice(num_list, a, num_list.length-1, 1);
            case 3:
                return slice(num_list, a, b, 1);
            case 4:
                return slice(num_list, a, b, c);
            default:
                return num_list;
        }
    }
    
    private int[] slice(int[] original, int startIdx, int endIdx, int jump){
        List<Integer> list = new ArrayList<>();
        for(int i=startIdx; i<=endIdx; i+=jump){
            if(i >= original.length) break;
            list.add(original[i]);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}