class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] count = new int[7];
        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;
        
        int max = 0;
        int maxIdx = 0;
        for(int i=0; i<7; i++){
            if(count[i] > max){
                max = count[i];
                maxIdx = i;
            }
        }
        
        if(max == 4){
            return 1111 * maxIdx;
        }else if(max == 3){
            int q = 0;
            for(int i=0; i<7; i++){
                if(count[i] == 1){
                    q = i;
                    break;
                }
            }
            return (int)Math.pow(10 * maxIdx + q, 2);
        }else if(max == 2){
            int[] temp = new int[2];
            int idx = 0;
            for(int i=0; i<7; i++){
                if(count[i] > 0 && i != maxIdx){
                    temp[idx++] = i;
                }
            }
            if(idx == 1){
                return (maxIdx + temp[0]) * (temp[0] - maxIdx);
            }else{
                return temp[0] * temp[1];
            }
        }else{
            return maxIdx;
        }
    }
}