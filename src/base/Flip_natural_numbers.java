package base;

public class Flip_natural_numbers {
    public int[] solution(long n) {

        String arr = String.valueOf(n);


        int[] answer = new int[arr.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(arr.substring(answer.length-1-i, answer.length-i));
        }

        return answer;
    }
}
