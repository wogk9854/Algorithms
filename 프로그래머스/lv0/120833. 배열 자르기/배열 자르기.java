class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int a = 0;
        if(num1 > num2){
            a = (num1 - num2) + 1;
        } else {
            a = (num2 - num1) + 1;
        }
        int[] answer = new int[a];
        int num = 0;
        for(int i = 0; i < numbers.length; i++){
            if(num1 <= i && i <= num2){
                answer[num] = numbers[i];
                num++;
            }
        }
        
        
        
        
        return answer;
    }
}