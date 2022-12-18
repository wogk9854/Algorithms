package programmers;

import java.util.Arrays;

public class 배열두배만들기 {

    static class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = numbers[i] * 2;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(numbers)));

    }
}
