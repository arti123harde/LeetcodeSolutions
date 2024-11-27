package org.solutions.leetcode.array.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class XKindInDeckOfCards {

    public static void main(String[] args) {
        System.out.println(hasGroupsSizeX(new int[]{1}));
        System.out.println(hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1}));
        System.out.println(hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3}));
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : deck) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        int cnt = 0;
        for (int l : map.values()) {
            if (cnt == 0) cnt = l;
            else cnt = gcd(cnt, l);
        }
        return cnt > 1;
    }

    private static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}
