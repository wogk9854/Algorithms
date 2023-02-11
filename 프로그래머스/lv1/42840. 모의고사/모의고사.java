class Solution {
    public int[] solution(int[] answers) {
        int[] numbers = new int[answers.length];
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = answers[i];
        }
        for (int i = 0, j = 0, j1 = 0, j3 = 0; i < numbers.length; i++, j++, j1++, j3++) {
            if (j == num1.length) {
                j = 0;
            }
            if (numbers[i] == num1[j]) {
                count1++;
            }
            if (j1 == num2.length) {
                j1 = 0;
            }
            if (numbers[i] == num2[j1]) {
                count2++;
            }
            if (j3 == num3.length) {
                j3 = 0;
            }
            if (numbers[i] == num3[j3]) {
                count3++;
            }
        }
        int[] answer = new int[1];
        if(count1 == count2 && count1 == count3){
            answer = new int[3];
            answer[0] = 1;
            answer[1] = 2;
            answer[2] = 3;
        }
        if(count1 > count2 && count1 > count3){
            answer[0] = 1;
        }else if(count2 > count1 && count2 > count3){
            answer[0] = 2;
        }else if(count3 > count1 && count3 > count2){
            answer[0] = 3;
        }else if(count1 >count3 && count1 == count2){
            answer = new int[2];
            answer[0] = 1;
            answer[1] = 2;
        }else if(count1 > count2 && count1 == count3){
            answer = new int[2];
            answer[0] = 1;
            answer[1] = 3;
        }else if (count2 > count1 && count2 == count3){
            answer = new int[2];
            answer[0] = 2;
            answer[1] = 3;
        }
         
        return answer;
    }
}