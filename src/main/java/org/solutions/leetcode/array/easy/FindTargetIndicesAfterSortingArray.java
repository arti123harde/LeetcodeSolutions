package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Arti Harde
 */
public class FindTargetIndicesAfterSortingArray {

    public static void main(String[] args) {
        System.out.println(targetIndices(new int[]{100,1,100}, 100));
        System.out.println(targetIndices(new int[]{1,2,5,2,3}, 2));
        System.out.println(targetIndices(new int[]{1,2,5,2,3}, 3));
        System.out.println(targetIndices(new int[]{1,2,5,2,3}, 5));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length){
           if(target == nums[i]) result.add(i);
           i++;
        }
        return result;
    }
}
