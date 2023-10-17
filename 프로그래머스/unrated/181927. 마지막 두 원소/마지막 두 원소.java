class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int lastNum = num_list[length - 1];
        int beforeNum = num_list[length - 2];
        
        int[] answer = new int[length + 1];
        for(int i=0; i<length; i++){
            answer[i] = num_list[i];
        }
        answer[length] = (lastNum > beforeNum) ? lastNum - beforeNum : lastNum * 2;
        
        return answer;
    }
}