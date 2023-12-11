import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[][] arr = new int[len][2];
        
        for(int i=0; i<len; i++){
            arr[i][0] = i;
            arr[i][1] = score[i][0] + score[i][1];
        }
        
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                return o2[1] - o1[1];
            }
        });
        
        int[] answer = new int[len];
        int beforeScore = -1;
        int record = 0;
        for(int i=0; i<len; i++){
            if(arr[i][1] == beforeScore){
                answer[arr[i][0]] = record;
            }else{
                beforeScore = arr[i][1];
                answer[arr[i][0]] = record = i + 1;
            }
        }
        
        return answer;
    }
}