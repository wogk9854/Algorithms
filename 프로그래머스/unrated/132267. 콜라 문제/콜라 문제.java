class Solution {
    public int solution(int a, int b, int n) {
        int answer = n / a;
            int remain = n % a;
            int s = (n / a) * b;

            while ((remain + s) >= a) {
                int sum = remain + s;
                s = (sum / a) * b;
                remain = sum % a;
                answer += (sum / a) * b;
            }
            return answer;
        }
    }