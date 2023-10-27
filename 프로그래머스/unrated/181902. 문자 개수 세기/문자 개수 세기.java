class Solution {
    public int[] solution(String my_string) {
        int[] counts = new int[52];
        int length = my_string.length();
        
        for(int i=0; i<length; i++){
            char ch = my_string.charAt(i);
            if(ch < 'a'){
                counts[ch - 'A']++;
            }else{
                counts[ch - 'a' + 26]++;
            }
        }
        
        return counts;
    }
}