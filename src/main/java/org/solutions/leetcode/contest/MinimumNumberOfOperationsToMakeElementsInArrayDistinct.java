package org.solutions.leetcode.contest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class MinimumNumberOfOperationsToMakeElementsInArrayDistinct {

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{8,7,9,3,7,14,13}));
        System.out.println(minimumOperations(new int[]{2,7,15,1,15}));
        System.out.println(minimumOperations(new int[]{6,7,8,9}));
        System.out.println(minimumOperations(new int[]{5,7,11,12,12}));
        System.out.println(minimumOperations(new int[]{1,2,3,4,2,3,3,5,7}));
        System.out.println(minimumOperations(new int[]{2,2,13}));
        System.out.println(minimumOperations(new int[]{4,5,6,4,4}));
    }

    public static int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = nums.length - 1; i >= 0; i--){
            if(set.contains(nums[i])) return (i + 3) / 3;
            set.add(nums[i]);
        }
        return 0;
    }
}
