class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb = new StringBuilder(); 
        for(int i = 1; i < food.length; i++) {
            int division = food[i] / 2;
            
            for(int j = 0; j < division; j++) {
                sb.append(i);
            }
        }
        String answer = sb.toString() + "0" + sb.reverse().toString();
        return answer;
    }
}