import java.util.*;

class Solution {
    public int solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int answer = 0;
        int reverse = 0;
        
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.equals("Z")){
                answer -= reverse;
                continue;
            }
            reverse = Integer.parseInt(token);
            answer += reverse;
        }
        
        return answer;
    }
}