class Solution {
    public int solution(String my_string) {
        String[] stringArray = my_string.split("[a-zA-Z]");
        int answer = 0;
        for (String value : stringArray) {
            answer += value.isEmpty() ? 0 : Integer.parseInt(value);
        }
        return answer;
    }
}