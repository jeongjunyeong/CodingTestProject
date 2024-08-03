package base;

import java.util.ArrayList;
import java.util.Scanner;

public class parents_node {

    // 방문했는지 여부 확인
    static boolean[] visited;
    // 2차원 배열 선언
    static ArrayList<Integer>[] nodes;
    // 부모 노드를 저장할 배열 선언
    static int[] parents;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N 개의 노드
        int N = sc.nextInt();
        visited = new boolean[N + 1];
        nodes = new ArrayList[N + 1];
        parents = new int[N + 1];

        // 인덱스에 arraylist 객체 생성
        for (int i = 0; i <= N; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < N-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodes[a].add(b); // [a]번 인덱스에 b를 추가하겠다.
            nodes[b].add(a); // [b]번 인덱스에 a를 추가하겠다.
        }

        for (int i = 0; i < N+1; i++) {
            System.out.println(nodes[i]);
        }

        // 시작노드를 (1) 이라고 하면
        dfs(1);

        for (int i = 2; i <=N; i++) {
            System.out.println(parents[i]);
        }
    }
    public static void dfs(int node){
        visited[node] = true;
        for(int i : nodes[node]){
            if (!visited[i]) {
                parents[i] = node;
                dfs(i);
            }
        }
    }
}
