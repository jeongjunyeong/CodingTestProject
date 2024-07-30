package base;

import java.util.Arrays;
import java.util.Scanner;

public class DFS_BFSXXX {

    private static String dfsRoute = "";
    private static String brfRoute = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N개의 노드
        int M = sc.nextInt(); // M개의 간선개수
        int V = sc.nextInt(); // 정점 시작 번호

        int[][] nodes = new int[N+1][N+1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodes[a][b] = nodes[b][a] = 1;
        }

        for (int i = 0; i < M; i++) {
            System.out.print(Arrays.toString(nodes[i])); // 자바는 주소값이 전달되기 떄문에 arrays.toString을 통해 주소에 있는 값을 가지고 온다.
        }

//        dfs(N, nodes, V);
    }

    // DFS 방문노드 처리 함수
    static void dfs(int N, int[][] nodes, int currentNode) {
        // N은 노드의 갯수
        // 연결되어 있는 노드배열
        // currentNode는 현재 노드 번호

        // 방문 했는가에 대한 배열 선언
        boolean[] vistied = new boolean[N];

        // 현재 노드 노드 방문처리
        vistied[currentNode] = true;

        // 방문 노드에 인접한 노드 찾기
        for (int i = 0; i < N; i++) {
            if (nodes[currentNode][i] == 1 && !vistied[i]){
//                dfs(i, );
            }
        }

        // DFS
        // 탐색 시작 노드 정보를 스택에 넣고 방문처리
        // 방문하지 않은 인접 노드가 있다면 수행 할 수 없을 때 까지 반복

        // 여러가지 방법 중 재귀함수를 통해 호출하는 방법 사용


    }

        // BFS



}
