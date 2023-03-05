class Solution {
    public int solution(String my_string) {
        int answer = 0;
            String str = my_string.replaceAll("[^\\d]", "");
            for (int i = 0; i < str.length(); i++) {
                answer += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            return answer;
    }
}