import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int num = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                num = numbers[i] + numbers[j];
                if (arr.indexOf(num) < 0) {
                    arr.add(num);
                }
            }
        }
        int[] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}