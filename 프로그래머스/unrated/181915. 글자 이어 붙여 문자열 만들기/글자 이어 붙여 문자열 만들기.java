class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        
        int length = index_list.length;
        for(int i=0; i<length; i++){
            sb.append(my_string.charAt(index_list[i]));
        }
        
        return sb.toString();
    }
}