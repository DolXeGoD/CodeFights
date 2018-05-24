package com.dolxegod.codefights.Intro.EdgeoftheOcean;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MakeArrayConsecutive2 {
    public static void main(String[] args) {
        int[] a = new int[]{6, 2, 3, 8};
        int[] b = new int[]{0, 3};
        int[] c = new int[]{5, 4, 6};
        int[] d = new int[]{6, 3};
        makeArrayConsecutive2(a);
        makeArrayConsecutive2(b);
        makeArrayConsecutive2(c);
        makeArrayConsecutive2(d);
    }

    private static int makeArrayConsecutive2(int[] statues) {
        int min = statues[0];
        int max = statues[0];
        for (int i = 0; i < statues.length; i++) {
            if (statues[i] < min)
                min = statues[i];
            if (statues[i] > max)
                max = statues[i];
        }
        int a = max - min + 1 - statues.length;
        System.out.println(a);
        return a;
    }
}
