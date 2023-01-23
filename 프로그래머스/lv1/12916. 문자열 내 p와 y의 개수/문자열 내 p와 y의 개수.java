class Solution {
    boolean solution(String s) {
        boolean answer = true;
            s = s.toLowerCase();
            int pCount = 0;
            int yCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (String.valueOf(s.charAt(i)).equals("p")){
                    pCount++;
                }
                if (String.valueOf(s.charAt(i)).equals("y")){
                    yCount++;
                }
            }
            answer = pCount == yCount;

            return answer;
        }
    }