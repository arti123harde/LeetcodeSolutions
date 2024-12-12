package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class FindIndicesWithIndexAndValueDifferenceI {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIndices(new int[]{5, 1, 4, 1}, 2, 4)));
    }

    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for(int i=0; i<nums.length-indexDifference; i++){
            for(int j=i+indexDifference; j<nums.length; j++){
                if(Math.abs(i-j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}