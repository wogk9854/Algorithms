class Solution {
    public int solution(int n) {
        int answer = 0;
        double result = n / 7.0;
        answer = (int) Math.ceil(result);
        return answer;
    }
}