class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        boolean mode = true;
        for (int i = 0; i < str.length; i++) {
            if (i == 0) {
                answer += Integer.parseInt(str[i]);
            } else {
                if (str[i].equals("+")) {
                    mode = true;
                } else if (str[i].equals("-")) {
                    mode = false;
                } else {
                    if (mode) {
                        answer += Integer.parseInt(str[i]);
                    } else {
                        answer -= Integer.parseInt(str[i]);
                    }
                }
            }
        }
        return answer;
    }
}