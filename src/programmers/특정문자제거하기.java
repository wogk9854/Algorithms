package programmers;

public class 특정문자제거하기 {

    static class Solution {
        public String solution(String my_string, String letter) {
            String answer = "";
            for (int i = 0; i < my_string.length(); i++) {
                if(!my_string.substring(i, i+1).equals(letter)){
                    answer += my_string.substring(i, i+1);
                }
            }
            return answer;
        }
    }



    public static void main(String[] args) {
        String my_string = "BCBdbe";
        String letter = "B";
        Solution solution = new Solution();
        System.out.println(solution.solution(my_string, letter));
    }
}
