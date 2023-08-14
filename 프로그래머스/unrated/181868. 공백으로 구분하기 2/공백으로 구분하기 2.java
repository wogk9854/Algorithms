import java.util.*;
class Solution {
    public List solution(String my_string) {
        List<String> answer = new ArrayList<>();
        String[] my_string_list = my_string.split(" ");
        for(int i = 0; i<my_string_list.length;i++){
            if(!my_string_list[i].equals("")){
                answer.add(my_string_list[i]);
            }
        }
        return answer;
    }
}