import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String a = Long.toString(n);
        String[] str = a.split("");
        Arrays.sort(str, Collections.reverseOrder());
        String b = "";
         for(int i = 0; i < str.length; i++){
            b += str[i];
        }
        long answer = Long.parseLong(b);
        
        
        
        return answer;
    }
}