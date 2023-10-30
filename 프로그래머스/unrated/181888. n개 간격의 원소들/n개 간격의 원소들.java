class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[(int)(Math.ceil(length * 1.0 / n))];
        
        int idx = 0;
        for(int i=0; i<length; i+=n){
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}