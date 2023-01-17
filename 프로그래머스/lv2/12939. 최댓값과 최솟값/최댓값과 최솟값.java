import java.util.Arrays;

class Solution {
    public String solution(String s) {
         String answer = "";
            String[] str = s.split(" ");
            int[] a = new int[str.length];

            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            Arrays.sort(a);
            answer = a[0] + " " + a[a.length-1];
            return answer;
        }
    }