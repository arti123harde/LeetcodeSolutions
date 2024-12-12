package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class FindTheLosersOfTheCircularGame {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(circularGameLosers(2, 1)));
        System.out.println(Arrays.toString(circularGameLosers(1, 1)));
        System.out.println(Arrays.toString(circularGameLosers(3, 2)));
        System.out.println(Arrays.toString(circularGameLosers(5, 2)));
        System.out.println(Arrays.toString(circularGameLosers(4, 4)));
    }

    public static int[] circularGameLosers(int n, int k) {
        boolean[] players = new boolean[n];
        int k1 = k;
        int i = 0;
        while (!players[i]) {
            players[i] = true;
            i = (i + k1) % n;
            k1 += k;
        }
        List<Integer> left = new ArrayList<>();
        for (int j = 0; j < n; j++) if (!players[j]) left.add(j + 1);
        int[] result = new int[left.size()];
        for (int j = 0; j < left.size(); j++) result[j] = left.get(j);
        return result;
    }
}
