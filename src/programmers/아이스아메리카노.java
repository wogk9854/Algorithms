package programmers;

import java.util.Arrays;

public class 아이스아메리카노 {
    static class Solution {
        public int[] solution(int money) {
            int price  = 5500;
            int result = money / price ;
            int result2 = money % price ;

            int[] answer = {result, result2};

            return answer;
        }
    }

    public static void main(String[] args) {
        int money = 10000;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(money)));

    }
}
