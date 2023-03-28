import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        int count2 = 0;
        
        for(int i = 0; i <arr.length; i++){
            if(arr[i] % divisor == 0){
                count++;
                count2++;
            }
        }
        if(count == 0){
            count += 1;
        }  
        
        int[] answer = new int[count];
        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[j] = arr[i];
                j++;
            }
            if(count2 == 0){
                answer[0] = -1;
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}