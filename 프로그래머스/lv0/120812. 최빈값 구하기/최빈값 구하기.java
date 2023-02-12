import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int num = 1;
            int count = 0;
            int[] arrays = Arrays.stream(array).distinct().toArray();
            for (int i = 0; i < array.length; i++) {
                if (arrays[0] == array[i]) {
                    count++;
                }
            }
            int answer = arrays[0];
            for (int i = 1; i < arrays.length; i++) {
                int cnt = 0;
                for (int j = 0; j < array.length; j++) {
                    if (arrays[i] == array[j]) {
                        cnt++;
                    }
                }
                answer = count < cnt ? arrays[i] : answer;
                num = count > cnt ? num : 1;
                if (count == cnt) {
                    num = 2;
                }
                count = count >= cnt ? count : cnt;
            }
            answer = num == 2 ? -1 : answer;
            return answer;
        }
    }