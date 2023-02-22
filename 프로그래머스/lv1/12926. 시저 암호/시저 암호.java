import java.util.Arrays;
class Solution {
    public String solution(String s, int n) {
         String[] A = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] str = new String[s.length()];
        String[] str1 = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(s.charAt(i));
        }
        System.out.println(Arrays.toString(str));
        for (int j = 0; j < str.length; j++) {
            for (int i = 0; i < A.length; i++) {
                if (Character.isUpperCase(s.charAt(j))) {
                    if (A[i].equals(str[j])) {
                        if (i + n >= A.length) {
                            int num = (i + n) - A.length;
                            str1[j] = A[num];
                        } else {
                            str1[j] = A[i + n];
                        }

                    }
                } else if(Character.isLowerCase(s.charAt(j)))  {
                    if (a[i].equals(str[j])) {
                        if (i + n >= A.length) {
                            int num = (i + n) - A.length;
                            str1[j] = a[num];
                        } else {
                            str1[j] = a[i + n];
                        }
                    }
                }else{
                    str1[j] = " ";
                }
            }

            if (j == str.length) {
                break;
            }
        }
         String answer = "";
        for(String ch : str1){
            answer += ch;
        }
        
        return answer;
    }
}