package base;

import java.util.Scanner;

public class insert_operator {

    // 전역변수로 사용할 5개를 정의해 준다.
    public static int MAX = -1000000000; // 최대값을 0으로 초기화
    public static int MIN = 1000000000; // 최소값을 0으로 초기화
    public static int num; // 숫자 갯수
    public static int[] number; // 들어가는 숫자
    public static int[] operator = new int[4]; // 4개의 연산자

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // 숫자갯수 입력
        num = sc.nextInt();
        number = new int[num];

        // 숫자 입력
        for(int i = 0; i<num; i++){
            number[i] = sc.nextInt();
        }

        // 연산자 갯수 입력
        for(int i=0; i<4; i++){
            operator[i] = sc.nextInt();
        }

        dfs(number[0],1);

        System.out.println(MAX);
        System.out.println(MIN);

    }

    // 깊이우선탐색 메소드를 만들어서 계속해서 반복해 준다.
    public static void dfs(int num1, int num2){

        //먼저 연산자와 지금까지 반복한 횟수 num2 가 같다면
        if(num2 == num){
            // MAX의 값과 MIN의 값을 비교하는 Math. 를 이용하여 값을 계속해서 초기화.
            MAX = Math.max(MAX, num1);
            MIN = Math.min(MIN, num1);
        }

        for(int i=0; i < 4; i++){

            if (operator[i] > 0 ){
                operator[i]--;

                switch (i) {
                    case 0: dfs(num1 + number[num2], num2 + 1); break;
                    case 1: dfs(num1 - number[num2], num2 + 1); break;
                    case 2: dfs(num1 * number[num2], num2 + 1); break;
                    case 3: dfs(num1 / number[num2], num2 + 1); break;
                }
                operator[i]++;
            }
        }

    }

}