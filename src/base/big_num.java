package base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class big_num { 
    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        String[] str = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, (a1, a2) -> (a2 +  a1).compareTo(a1 + a2));

//        if(str[0].equals("0")) {
//            return "0";
//        }
//        return String.join("", str);
        System.out.println(str);
    }
}
