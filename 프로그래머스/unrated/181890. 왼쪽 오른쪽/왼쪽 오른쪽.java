class Solution {
    public String[] solution(String[] str_list) {
        int length = str_list.length;
        int startIdx = -1;
        int endIdx = -1;
        
        for(int i=0; i<length; i++){
            if(str_list[i].equals("l")){
                endIdx = i;
                break;
            }else if(str_list[i].equals("r")){
                startIdx = i + 1;
                break;
            }
        }
        
        if(startIdx > -1){
            String[] answer = new String[length - startIdx];
            int idx = 0;
            for(int i=startIdx; i<length; i++){
                answer[idx++] = str_list[i];
            }
            return answer;
        }else if(endIdx > -1){
            String[] answer = new String[endIdx];
            int idx = 0;
            for(int i=0; i<endIdx; i++){
                answer[idx++] = str_list[i];
            }
            return answer;
        }
        
        return new String[]{};
    }
}