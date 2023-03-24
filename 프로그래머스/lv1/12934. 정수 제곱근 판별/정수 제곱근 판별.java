class Solution {
    public long solution(long n) {
        long answer = 0;
        double a =  Math.ceil(Math.sqrt(n));
        
        if(Math.pow(a, 2) == n){
            answer = (long)Math.pow(a + 1, 2);
        }else{
            answer = -1;
        }
        
        
        return answer;
    }
}