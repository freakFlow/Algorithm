class Solution {
    public int solution(int a, int b, int c) {
        if(a == b){
            int temp = (a + b + c) * (a * a + b * b + c * c);
            return (a == c) ? temp * (a * a * a + b * b * b + c * c * c) : temp;
        }else if(a == c){
            return (a + b + c) * (a * a + b * b + c * c);
        }else if(b == c){
            return (a + b + c) * (a * a + b * b + c * c);
        }else{
            return a + b + c;
        }
    }
}