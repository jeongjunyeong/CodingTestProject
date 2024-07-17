package base;

import java.util.Scanner;

public class AtoB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 1;

        while (a < b) {
            if (b % 2 == 0) {
                b = b / 2;
                count++;
//                System.out.println("count : " + count);
//                System.out.println("b : " + b);
            } else if (b % 10 == 1){
                b = (b - 1) / 10;
                count++;
//                System.out.println("count : " + count);
//                System.out.println("b : " + b);
            } else{
                System.out.println(-1);
                break;
            }
        }
        if(a==b) {
            System.out.println(count);
        } else if (a>b) {
            System.out.println(-1);
        }

    /*
    정수 A를 B로 바꾸려고 한다. 가능한 연산은 다음과 같은 두 가지이다.

    2를 곱한다.
    1을 수의 가장 오른쪽에 추가한다.
    A를 B로 바꾸는데 필요한 연산의 최솟값을 구해보자.
     */

        // 가장먼저 떠오른 방법은 거꾸로 생각하는것이다.
        // 맨 뒤에 1이 있으면 1을 없애주고 => 2로 나누어 지는가? 판단
        // 2로 나누어 지면 2로 나누다
        // 둘다 아니면 불가능


    }
}
