class Solution {
        public String solution(int age) {
            String answer = "";
            String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
            String a = String.valueOf(age);
            for (int i = 0; i < a.length(); i++) {
                answer += str[Integer.parseInt(String.valueOf(a.charAt(i)))];

            }
            return answer;
        }
    }