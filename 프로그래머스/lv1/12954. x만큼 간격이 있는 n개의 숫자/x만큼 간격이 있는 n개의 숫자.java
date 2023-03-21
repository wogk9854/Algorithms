class Solution {
    public long[] solution(long x, int n) {
            int s;
            try{
                s = (int) (((x * n) / x) < 0 ? ((x * n) / x) * -1 : ((x * n) / x));
            }catch (ArithmeticException e){
                s = n;
            }

            long[] answer = new long[s];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = (i + 1) * x;
            }
            return answer;
        }
    }