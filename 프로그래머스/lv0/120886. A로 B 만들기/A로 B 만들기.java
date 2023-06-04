import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int[] beforeArray = new int[26];
        int[] afterArray = new int[26];

        for (int i = 0; i < before.length(); i++) {
            beforeArray[before.charAt(i) - 'a']++;
        }

        for (int i = 0; i < after.length(); i++) {
            afterArray[after.charAt(i) - 'a']++;
        }

        return Arrays.equals(beforeArray, afterArray) ? 1 : 0;
    }
}