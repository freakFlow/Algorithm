class Solution {
    public String[] solution(String[] names) {
        int length = names.length;
        int size = (int)(Math.ceil(length * 1.0 / 5));
        String[] answer = new String[size];
        
        int idx = 0;
        for(int i=0; i<length; i++){
            if(i % 5 == 0){
                answer[idx++] = names[i];
            }
        }
        
        return answer;
    }
}