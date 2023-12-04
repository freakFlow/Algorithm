import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(my_string);
        
        answer += Integer.parseInt(st.nextToken());
        
        while(st.hasMoreTokens()){
            String oper = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            if(oper.equals("+")) answer += num;
            else answer -= num;
        }
        
        return answer;
    }
}