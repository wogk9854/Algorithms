class Solution {
    public int solution(String t, String p) {
        int answer = 0;
            int a = p.length();
            for (int i = 0; i <= t.length()-a; i++) {
                String str = "";
                for (int j = 0; j < p.length(); j++) {
                    str += String.valueOf(t.charAt(i+j));
                }
                long j = Long.parseLong(str);

                if(j <= Long.parseLong(p)){
                    answer++;
                }
            }
            return answer;
        }
    }