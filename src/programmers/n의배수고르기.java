package programmers;

import java.util.Arrays;

public class n의배수고르기 {
    static class Solution {
        public int[] solution(int n, int[] numlist) {
            int count = 0;
            for (int i : numlist) {
                if (i % n == 0) {
                    count += 1;
                }
            }
            int[] answer = new int[count];
            for (int i = 0, j = 0; i < numlist.length; i++) {
                if(numlist[i] % n == 0){
                     answer[j] = numlist[i];
                     j++;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(solution.solution(n, numlist)));

    }
}
