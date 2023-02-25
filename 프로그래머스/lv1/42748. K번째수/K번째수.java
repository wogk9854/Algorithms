import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
         int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int k = commands[i][2] - 1;
            int[] copyarr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(copyarr);

            answer[i] = copyarr[k];

        }
        return answer;
    }
}