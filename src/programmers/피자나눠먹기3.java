package programmers;

public class 피자나눠먹기3 {
    static class Solution {
        public int solution(int slice, int n) {
            int answer = (n % slice == 0) ? n / slice : n / slice + 1;

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int slice = 7;
        int n = 10;
        System.out.println(solution.solution(slice, n));
    }
}
