import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String A = "";
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            boolean result = Character.isUpperCase(s.charAt(i));
            if (result) {
                A += s.charAt(i);
            } else {
                a += s.charAt(i);
            }
        }
        String[] str = new String[A.length() + a.length()];
        for (int i = 0; i < a.length(); i++) {
            str[i] = String.valueOf(a.charAt(i));
        }
        for (int i = 0; i < A.length(); i++) {
            str[a.length() + i] = String.valueOf(A.charAt(i));
        }
        Arrays.sort(str, Collections.reverseOrder());
        String answer = "";
        for (int i = 0; i<str.length; i++){
            answer += str[i];
        }
        
        
        
        return answer;
    }
}