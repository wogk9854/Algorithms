class Solution {
    public int solution(int[] array, int n) {
        int answer = 100_000;
        for(int num : array){
            int diff = num - n;
            if(Math.abs(diff) < Math.abs(answer)){
                answer = diff;
            }else if(Math.abs(diff) == Math.abs(answer) && diff < answer){
                answer = diff;
            }
        }
        answer = n + answer;
        return answer;
    }
}