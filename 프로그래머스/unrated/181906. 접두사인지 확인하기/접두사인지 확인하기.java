class Solution {
    public int solution(String my_string, String is_prefix) {
        int strLen = my_string.length();
        int preLen = is_prefix.length();
        
        if(preLen > strLen) return 0;
        
        return (is_prefix.equals(my_string.substring(0, preLen))) ? 1 : 0;
    }
}