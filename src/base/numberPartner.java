package base;

import java.util.Arrays;
import java.util.HashMap;

public class numberPartner {
    public static void main(String[] args) {
        String X = "3403";
        String Y = "13203";

        int[] arr = {};
        Integer[] numberX = new Integer[]{Integer.parseInt(Arrays.toString(X.split("")))};
        Integer[] numberY = new Integer[]{Integer.parseInt(Arrays.toString(Y.split("")))};

        HashMap<Integer, Integer> xmap = new HashMap<>();
        HashMap<Integer, Integer> ymap = new HashMap<>();

        System.out.println(numberX);
        System.out.println(numberY);

//        for(i=0; i<numberX.length; i++){
//            xmap.put(i,numberX[i]);
//        }
//        for(i=0; i<numberY.length; i++){
//            xmap.put(i,numberY[i]);
//        }

    }
}
