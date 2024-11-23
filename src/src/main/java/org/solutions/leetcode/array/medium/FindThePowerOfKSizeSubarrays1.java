package org.solutions.leetcode.array.medium;

import org.solutions.leetcode.common.PrintUtil;

public class FindThePowerOfKSizeSubarrays1 {

    public static void main(String[] args) {
        PrintUtil.printArray(resultsArray(new int[]{1,3,4}, 2));
        PrintUtil.printArray(resultsArray(new int[]{1,2,3,4,3,2,5}, 3));
        PrintUtil.printArray(resultsArray(new int[]{2,2,2,2,2}, 4));
        PrintUtil.printArray(resultsArray(new int[]{3,2,3,2,3,2}, 2));
    }

    public static int[] resultsArray(int[] nums, int k) {
        if(k == 1) return nums;
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        while (index < (nums.length - k + 1)){
            int max = 0;
            for(int i=index; i<(index+k-1); i++){
                if(nums[i+1] - nums[i] == 1) {
                    max = nums[i + 1];
                } else {
                    max = -1;
                    break;
                }
            }
            result[index] = max;
            index++;
        }
        return result;
    }
}
