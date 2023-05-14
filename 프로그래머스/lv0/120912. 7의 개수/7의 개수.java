class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i=0; i<array.length; i++) {
            String word = Integer.toString(array[i]);

            for (int j=0; j<word.length(); j++) {
                if (word.substring(j, j+1).equals("7")) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}