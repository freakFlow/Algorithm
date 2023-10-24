class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        int length = my_strings.length;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<length; i++){
            int s = parts[i][0];
            int e = parts[i][1];
            sb.append(my_strings[i].substring(s, e + 1));
        }
        
        return sb.toString();
    }
}