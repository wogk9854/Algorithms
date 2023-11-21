import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i1=0, i2=0;
        
        for(int i=0;i<goal.length;i++){
            String target = goal[i];
            if(i1 < cards1.length && cards1[i1].equals(target)){
                i1++;
            }else if(i2 < cards2.length && cards2[i2].equals(target)){
                i2++;
            }else
                return "No";
        }
        return "Yes";
    }
}