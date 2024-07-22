package base;

/*
임스가 미니게임을 같이할 사람을 찾고 있습니다.

플레이할 미니게임으로는 윷놀이
$Y$, 같은 그림 찾기
$F$, 원카드
$O$가 있습니다. 각각 2, 3, 4 명이서 플레이하는 게임이며 인원수가 부족하면 게임을 시작할 수 없습니다.

사람들이 임스와 같이 플레이하기를 신청한 횟수
$N$과 임스가 플레이할 게임의 종류가 주어질 때, 최대 몇 번이나 임스와 함께 게임을 플레이할 수 있는지 구하시오.

임스와 여러 번 미니게임을 플레이하고자 하는 사람이 있으나, 임스는 한 번 같이 플레이한 사람과는 다시 플레이하지 않습니다.

임스와 함께 플레이하고자 하는 사람 중 동명이인은 존재하지 않습니다. 임스와 lms0806은 서로 다른 인물입니다.

 */

import java.util.*;
import java.util.stream.Collectors;

public class nini_game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 인원수
        String b = sc.next(); // 게임종류선택
        String[] c = new String[a]; // 인원수에 맞게 이름적기
        List<String> name = Arrays.asList(c);

        for (int i = 0; i < a; i++) {
            c[i] = sc.next();
        }
        // JAVA 8 이상 제공되는 Stream 사용.
        List<String> newName = name.stream().distinct().collect(Collectors.toList());

        int d = newName.toArray().length;
        switch (b) {
            case "Y":
                System.out.println(d);
                break;
            case "F":
                System.out.println(d / 2);
                break;
            case "O":
                System.out.println(d / 3);
                break;
            default:
                System.out.println("");
                break;
        }
    }
}
//
//        for (int i = 0; i < newName.toArray().length; i++) {
//            System.out.println(newName.get(i));
//        }
//

//        for (int i = 0; i < a; i++) {
//            for (int j = 1; j < a; j++) {
//                if (c[i] == c[j]) {
//
//                }
//            }
//        }
//
//
//        if(b=="Y"){
//
//        } else if (b=="F") {
//
//        } else if (b=="O") {
//
//        }
//
//        }


/*
 0. 총 몇명인지 파악
 1. 배열에 이름 넣기
 2. if 문을 사용해서 Y,F,O 를 판단.
 3. 같은이름일 경우에는 제외해  주고 숫자 세기.
 4. F일 경우 3으로 나누는데 같은이름일 경우에는 제외해 준다.
 5. O일 경우 4로 나누는데 같은이름일 경우에는 제외해 준다.
*/
