class Solution {
    public int solution(int n) {
        int answer = 1;
            int s = n % 2 == 0 ? n / 2 : (n / 2) + 1;
            System.out.println(s);
            for (int i = 1; i <= s; i++) {
                int k = i;
                for (int j = 1 + i; j <= s; j++) {
                    k += j;
                    if (n == k){
                        answer++;
                    }
                    if(n < k){
                        break;
                    }
                }
            }
            return answer;
        }
    }