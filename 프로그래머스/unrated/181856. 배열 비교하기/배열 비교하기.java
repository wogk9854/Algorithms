class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int lenArr1 = arr1.length;
        int lenArr2 = arr2.length;
        int sumArr1 = 0;
        int sumArr2 = 0;
        
        for (int i = 0; i < lenArr1; i++) {
            sumArr1 += arr1[i];
        }
        
        for (int i = 0; i < lenArr2; i++) {
            sumArr2 += arr2[i];
        }
        
        if (lenArr1 != lenArr2) {
            if (lenArr1 > lenArr2) {
                answer = 1;
            } else if (lenArr1 < lenArr2) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        if (lenArr1 == lenArr2) {
            if (sumArr1 > sumArr2) {
                answer = 1;
            } else if (sumArr1 < sumArr2) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}