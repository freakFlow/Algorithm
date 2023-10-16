class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        
        for(int i=num_list.length-1; i>=0; i--){
            int num = num_list[i];
            mul *= num;
            sum += num;
        }
        
        return (mul < sum * sum) ? 1 : 0;
    }
}