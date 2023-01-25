import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
            String[] str = s.split(" ", -1);
            List<String> list = new ArrayList<>();
            for (int i = 0; i < str.length; i++) {
                    list.add(str[i]);
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals("")){
                    answer += "";
                } else if(Character.isDigit(list.get(i).charAt(0))){
                    answer += list.get(i).toLowerCase();
                }else{
                    answer += list.get(i).substring(0, 1).toUpperCase();
                    answer += list.get(i).substring(1).toLowerCase();
                }
                answer += i == list.size()-1 ? "" : " ";
            }
            return answer;
        }
    }