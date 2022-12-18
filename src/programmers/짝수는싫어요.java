package programmers;

import java.util.Arrays;

public class 짝수는싫어요 {

    static class Solution {
        public int[] solution(int n) {
            int count = 0;
            if (n % 2 == 0) {
                count = n / 2;
            } else {
                count = n / 2 + 1;
            }
            int[] answer = new int[count];
            for (int i = 1, j = 0; i <= n; i++) {
                if (i % 2 == 1) {
                    answer[j] = i;
                    j++;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int n = 15;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(n)));
    }
}
