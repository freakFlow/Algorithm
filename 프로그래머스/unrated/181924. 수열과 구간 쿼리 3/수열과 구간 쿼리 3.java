class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int length = queries.length;
        
        for(int i=0; i<length; i++){
            swap(arr, queries[i][0], queries[i][1]);
        }
        
        return arr;
    }
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}