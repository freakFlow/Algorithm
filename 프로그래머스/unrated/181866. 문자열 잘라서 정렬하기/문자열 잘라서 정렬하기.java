import java.util.*;

class Solution {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x");
        int size = st.countTokens();
        
        String[] answer = new String[size];
        for(int i=0; i<size; i++){
            answer[i] = st.nextToken();
        }
        
        Arrays.sort(answer);
        return answer;
    }
}