package programmers;

public class 세균증식 {
    static class Solution {
        public int solution(int n, int t) {
            int answer = n;
            for (int i = 0; i < t; i++) {
                answer *= 2;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 2;
        int t = 10;
        System.out.println(solution.solution(n ,t));

    }
}
