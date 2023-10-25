class Solution {
    public int solution(String my_string, String is_suffix) {
        int strLength = my_string.length();
        int suffixLength = is_suffix.length();
        
        if(strLength < suffixLength) return 0;
        
        return (is_suffix.equals(my_string.substring(strLength - suffixLength, strLength))) ? 1 : 0;
    }
}