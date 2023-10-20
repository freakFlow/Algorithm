class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int arrLen = arr.length;
        int queryLen = queries.length;
        
        for(int i=0; i<queryLen; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j=0; j<arrLen; j++){
                if(j % k == 0 && s <= j && j <= e){
                    arr[j]++;
                }
            }
        }
        
        return arr;
    }
}