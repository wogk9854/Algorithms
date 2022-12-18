package programmers;

public class 개미군단 {
    static class Solution {
        public int solution(int hp) {
            int answer = hp / 5;

            answer += ((hp % 5) >= 3) ? ((hp % 5) / 3) + ((hp % 5) % 3) : (hp % 5);
            return answer;
        }
    }
    public static void main(String[] args) {
        int hp = 999;
        Solution solution = new Solution();
        System.out.println(solution.solution(hp));
    }
}
