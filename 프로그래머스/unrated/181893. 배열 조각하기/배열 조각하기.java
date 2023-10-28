class Solution {
    public int[] solution(int[] arr, int[] query) {
        int startIdx = 0;
        int endIdx = arr.length;
        
        for(int i=0; i<query.length; i++){
            if(i % 2 == 0){
                endIdx = startIdx + query[i];
            }else{
                startIdx += query[i];
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