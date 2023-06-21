import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                answerList.add(i);
                if (n / i != i) answerList.add(n / i);
            }
        }
        return answerList.stream()
                .mapToInt(i -> i)
                .sorted()
                .toArray();
    }
}