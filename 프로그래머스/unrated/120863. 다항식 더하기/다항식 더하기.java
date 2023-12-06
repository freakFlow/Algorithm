import java.util.*;

class Solution {
    public String solution(String polynomial) {
        int numOfX = 0;
        int num = 0;
        
        StringTokenizer st = new StringTokenizer(polynomial);
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(str.equals("+")) continue;
            
            if(str.charAt(str.length() - 1) == 'x'){
                numOfX += (str.length() == 1) ? 1 : Integer.parseInt(str.substring(0, str.length() - 1));
            }else{
                num += Integer.parseInt(str);
            }
        }
        
        StringBuilder answer = new StringBuilder();
        
        if(numOfX > 0){
            if(numOfX > 1) answer.append(numOfX);
            answer.append('x');
            if(num > 0) answer.append(" + ");
        }
        
        if(num > 0) answer.append(num);
        
        return answer.toString();
    }
}