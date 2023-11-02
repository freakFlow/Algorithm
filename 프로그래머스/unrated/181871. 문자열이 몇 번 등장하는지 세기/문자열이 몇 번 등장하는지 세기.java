class Solution {
    public int solution(String myString, String pat) {
        int length = myString.length();
        int patLen = pat.length();
        int diff = length - patLen;
        int answer = 0;
        
        for(int i=0; i<=diff; i++){
            if(myString.substring(i, i+patLen).equals(pat)){
                answer++;
            }
        }
        
        return answer;
    }
}