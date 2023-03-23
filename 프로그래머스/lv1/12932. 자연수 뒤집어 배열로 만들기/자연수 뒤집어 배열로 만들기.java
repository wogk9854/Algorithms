import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        String a = Long.toString(n);
        String[] str = a.split("");
        int[] answer = new int[str.length];
        int[] number = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();

        for (int i = number.length - 1, j = 0; i >= 0; i--, j++) {
            answer[j] = number[i];
        }
           
        return answer;
    }
}