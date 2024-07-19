package base;

public class park_walkXXX {
    class Solution {
        public int[] solution(String[] park, String[] routes) {

            // 입력받는 값을 배열에 넣기
            int[][] array;
            array = new int[3][3];

            System.out.println(array);



            int[] answer = {};
            return answer;
        }
    }

//먼저... 입출력 예시 보니까
//배열을 통해 내가 직사각형을 만들어 주네?

/*
SOO SOO OSO
OOO OXX OOO
OOO OOO OXO
        OOO
*/

// x는 장애물
// s는 시작지점

// 먼저 배열의 크기를 알아야지?
// 두번째로 시작 지점의 좌표를 알아야지?
// 그래. 나도 배열로 풀고 싶어. => 2차원 배열로 만들어서 해줄까?

// [
// [S00], S 의 값은 [0][0]
// [000],
// [000]
// ]

// 북쪽으로 N칸 => [-N][0]
// 남쪽으로 N칸 => [N][0]
// 동쪽으로 N칸 => [0][N]
// 서쪽으로 N칸 => [0][-N]

}
