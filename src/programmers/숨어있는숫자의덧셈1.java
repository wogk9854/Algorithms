package programmers;

public class 숨어있는숫자의덧셈1 {
    static class Solution {
        public int solution(String my_string) {
            int answer = 0;
            String str = my_string.replaceAll("[^\\d]", "");
            for (int i = 0; i < str.length(); i++) {
                answer += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        Solution solution = new Solution();
        System.out.println(solution.solution(my_string));
    }
}
