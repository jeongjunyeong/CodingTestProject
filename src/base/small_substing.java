package base;

public class small_substing {
    class Solution {
        public int solution(String t, String p) {

            int a = t.length();
            int b = p.length();
            int answer =0;

            for(int i=0; i<= a-b; i++){
                String subStr = t.substring(i, i+b);

                if(subStr.compareTo(p) <= 0) {
                    answer++;
                }
            }
            return answer;
        }
    }
}
