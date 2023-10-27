import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        int length = my_string.length();
        int size = indices.length;
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(indices);
        
        int index = 0;
        for(int i=0; i<length; i++){
            if(index < size && i == indices[index]){
                index++;
                continue;
            }
            
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}