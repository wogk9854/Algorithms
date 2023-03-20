import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = Integer.toString(n);
        String[] num = new String[a.length()];
        
        for (int i = 0, j = 1; i < num.length; i++, j++) {
                num[i] = a.substring(i, j);
            }
            int[] number = Arrays.stream(num).mapToInt(Integer::parseInt).toArray();
            for(int i = 0; i < number.length; i++){
                answer += number[i];
            }

        return answer;
        //실행
    }
}