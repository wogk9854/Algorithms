package programmers;

public class 자릿수더하기 {
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            String str = String.valueOf(n);
            for (int i = 0; i < str.length(); i++) {
                answer += Integer.parseInt(str.substring(i, i+1));
            }


            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 1234;
        System.out.println(solution.solution(n));
    }
}
