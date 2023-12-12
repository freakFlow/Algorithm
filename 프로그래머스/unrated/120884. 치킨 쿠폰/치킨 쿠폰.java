class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        
        while(true){
            int service = coupon / 10;
            if(service == 0) break;
            answer += service;
            coupon -= service * 10;
            coupon += service;
        }
        
        
        return answer;
    }
}