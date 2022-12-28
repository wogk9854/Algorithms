package programmers;

import java.util.Arrays;

public class 배열뒤집기 {
    static class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];
            int num = 0;
            for(int i = num_list.length -1; i >= 0; i--){
                answer[num] = num_list[i];
                num++;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num_list ={1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution.solution(num_list)));
    }
}
