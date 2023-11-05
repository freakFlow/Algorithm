import java.util.*;

class Solution {
    static final String[] EMPTY = {"EMPTY"};
    public String[] solution(String myStr) {
        StringTokenizer st = new StringTokenizer(myStr, "abc");
        int size = st.countTokens();
        
        if(size == 0) return EMPTY;
        
        String[] answer = new String[size];
        for(int i=0; i<size; i++){
            answer[i] = st.nextToken();
        }
        
        return answer;
    }
}