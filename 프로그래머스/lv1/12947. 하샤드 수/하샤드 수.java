class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int n = x;
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        if(x % sum == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}