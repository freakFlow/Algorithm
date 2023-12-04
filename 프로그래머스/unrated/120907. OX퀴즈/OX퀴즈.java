import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = calculate(quiz[i]);
        }
        
        return answer;
    }
    
    String calculate(String str){
        StringTokenizer st = new StringTokenizer(str);
        int num1 = Integer.parseInt(st.nextToken());
        String oper = st.nextToken();
        int num2 = Integer.parseInt(st.nextToken());
        st.nextToken();
        int answer = Integer.parseInt(st.nextToken());
        
        int cal = num1 + num2;
        if(oper.equals("-")) cal = num1 - num2;
        
        return (cal == answer) ? "O" : "X";
    }
}