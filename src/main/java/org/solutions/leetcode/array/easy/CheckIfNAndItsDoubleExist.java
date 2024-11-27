package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class CheckIfNAndItsDoubleExist {

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{3,1,7,11}));
        System.out.println(checkIfExist(new int[]{10,2,5,3}));
    }

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.isEmpty() && (((i % 2 == 0) && set.contains(i / 2)) || set.contains(i * 2))) return true;
            else set.add(i);
        }
        return false;
    }
}
