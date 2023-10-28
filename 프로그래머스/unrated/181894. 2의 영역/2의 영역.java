class Solution {
    public int[] solution(int[] arr) {
        int startIdx = -1;
        int endIdx = -1;
        int length = arr.length;
        int[] noAnswer = {-1};
        
        for(int i=0; i<length; i++){
            if(arr[i] == 2){
                startIdx = i;
                break;
            }
        }
        
        if(startIdx == -1) return noAnswer;
        
        for(int i=length-1; i>=startIdx; i--){
            if(arr[i] == 2){
                endIdx = i;
                break;
            }
        }
        
        int[] answer = new int[endIdx - startIdx + 1];
        int idx = 0;
        for(int i=startIdx; i<=endIdx; i++){
            answer[idx++] = arr[i];
        }
        
        return answer;
    }
}