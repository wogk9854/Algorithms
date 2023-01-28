class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
            long result = 0;
            int count = 0;
            int zeroCount = 0;
            int length = 0;
            String binaryString = "";
            if (!s.equals("1")) {
                while (result != 1) {
                    for (int i = 0; i < s.length(); i++) {
                        if (String.valueOf(s.charAt(i)).equals("0")) {
                            zeroCount++;
                        }
                    }
                    length = s.replaceAll("0", "").length();
                    binaryString = Integer.toBinaryString(length);
                    s = binaryString.equals("1") ? "1" : binaryString;
                    count++;
                    result = Long.parseLong(binaryString);
                }
            }
            answer[0] = count;
            answer[1] = zeroCount;
            return answer;
        }
    }