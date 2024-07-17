package base;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class card2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>(); // int형 queue 선언
        sc.close();
        for (int i = 1; i <= n; i++) {
            q.add(i);
            // 1부터 n까지 stack 추가
        }
        for (int i = 1; i < n; i++) {
            q.poll(); // 첫번째 값 삭제
            int a = q.poll(); // 첫번째 값을 삭제 -> 값을 리턴해준다
            q.add(a);
        }
        System.out.println(q.poll());
    }

}

    /*
    N장의 카드가 있다. 각각의 카드는 차례로 1부터 N까지의 번호가 붙어 있으며, 1번 카드가 제일 위에, N번 카드가 제일 아래인 상태로 순서대로 카드가 놓여 있다.

    이제 다음과 같은 동작을 카드가 한 장 남을 때까지 반복하게 된다. 우선, 제일 위에 있는 카드를 바닥에 버린다. 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.

    예를 들어 N=4인 경우를 생각해 보자. 카드는 제일 위에서부터 1234 의 순서로 놓여있다. 1을 버리면 234가 남는다. 여기서 2를 제일 아래로 옮기면 342가 된다. 3을 버리면 42가 되고, 4를 밑으로 옮기면 24가 된다. 마지막으로 2를 버리고 나면, 남는 카드는 4가 된다.

    N이 주어졌을 때, 제일 마지막에 남게 되는 카드를 구하는 프로그램을 작성하시오.
     */


// 스택 선언해 준뒤
// 1~N 까지 스택에 차곡 차곡 쌓아 넣는다

// 스택으로 할려니까 생각보다 복잡하게 짜여질것 같네??

// Queue 로 해보자!


