import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] ingredient) {
             int answer = 0;
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < ingredient.length; i++) {
                list.add(ingredient[i]);
            }
            for (int i = 0; i < list.size(); i++) {
                try {
                    if (list.get(i) == 1 && list.get(i + 1) == 2 && list.get(i + 2) == 3 && list.get(i + 3) == 1) {
                        list.remove(i);
                        list.remove(i);
                        list.remove(i);
                        list.remove(i);
                        answer++;
                        i -= 4;
                    }
                } catch (IndexOutOfBoundsException ignored) {
                }
            }

            return answer;
        }
    }