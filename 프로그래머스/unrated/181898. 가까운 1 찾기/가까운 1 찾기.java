class Solution {
    public int solution(int[] arr, int idx) {
        int length = arr.length;
        
        for(int i=idx; i<length; i++){
            if(arr[i] == 1) return i;
        }
        
        return -1;
    }
}