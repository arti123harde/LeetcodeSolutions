package org.solutions.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class NumberOfEquivalentDominoPairs {

    public static void main(String[] args) {
        System.out.println(numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}}));
        System.out.println(numEquivDominoPairs(new int[][]{{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}}));
    }

    public static int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;

        //Approach 1
//        Map<String, Integer> map = new HashMap<>();
//        for(int[] domino : dominoes){
//            String s = domino[0] > domino[1] ? domino[1] + String.valueOf(domino[0])
//                    : domino[0] + String.valueOf(domino[1]);
//            if(map.containsKey(s)) count += map.get(s);
//            map.put(s, map.getOrDefault(s, 0) + 1);
//        }

        //Approach 2
        int[] arr = new int[100];
        for(int[] domino : dominoes){
            int num = domino[0] > domino[1] ? domino[1] * 10 + domino[0] : domino[0] * 10 + domino[1];
            count += arr[num]++;
        }

        return count;

    }
}
