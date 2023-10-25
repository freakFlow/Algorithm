class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        StringBuilder reversed = new StringBuilder();
        
        reversed.append(my_string.substring(s, e + 1));
        
        sb.append(my_string.substring(0, s))
            .append(reversed.reverse().toString())
            .append(my_string.substring(e + 1, my_string.length()));
        
        return sb.toString();
    }
}