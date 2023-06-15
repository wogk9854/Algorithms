class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        answer =  Integer.toBinaryString(Integer.valueOf(bin1, 2)+Integer.valueOf(bin2, 2));    
        return answer;
    }
}