package org.solutions.leetcode.array.easy;


import org.solutions.leetcode.common.PrintUtil;

/**
 * @author Arti Harde
 */
public class ShuffleArray {

    public static void main(String[] args) {
        PrintUtil.printArray(shuffle(new int[]{2,5,1,3,4,7}, 3));
        PrintUtil.printArray(shuffle(new int[]{1,2,3,4,4,3,2,1}, 4));
        PrintUtil.printArray(shuffle(new int[]{1,1,2,2}, 2));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int count = 0;
        for(int i=0; i< n; i++){
            result[count] = nums[i];
            result[count+1] = nums[i + n];
            count = count+2;
        }
        return result;
    }
}