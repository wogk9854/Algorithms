class Solution {
    public int[] solution(int money) {
        int americano = 5500;
        
        int result = money / americano;
        int result2 = money % americano;
        
        
        int[] answer = {result, result2};
        
        return answer;
    }
}