import java.util.Arrays;
class Solution {
    public int solution(int left, int right) {
        int n = right - left;
         int[] arr = new int[n+1];
        for(int i = 0; i <= n; i++){
            arr[i] = left + i;
        }
        int count = 0;
        int answer = 0;
        
         for(int i : arr){
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    count++;
                }
            }
            if(count % 2 ==0){
                answer += i;
                count = 0;
            }else{
                answer -= i;
                count = 0;
            }
        }
        
        return answer;
    }
}