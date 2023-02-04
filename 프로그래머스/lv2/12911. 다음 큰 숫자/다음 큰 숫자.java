class Solution {
    public int solution(int n) {
        int answer = 0;
            int count = Integer.bitCount(n);
            int cnt = 0;
            int j = n + 1;
            while (cnt != count) {
                cnt = Integer.bitCount(j);
                j++;
            }
            answer = j - 1;

            return answer;
        }
    }