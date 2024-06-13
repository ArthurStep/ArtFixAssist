package main.artfix;

import java.util.ArrayList;
import java.util.Collections;


public class RandomNumForToe {

    public static String randomNumGet = null;
    private static ArrayList<Integer> numList = new ArrayList<Integer>();
    private static int index = 0;

    static {
        for (int i = 1; i <= 9; i++) {
            numList.add(i);
        }
        Collections.shuffle(numList);
    }

    public static void getNum() {
        if (index >= numList.size()) {
            return;
        }
        randomNumGet = Integer.toString(numList.get(index));
        index++;
    }

}
