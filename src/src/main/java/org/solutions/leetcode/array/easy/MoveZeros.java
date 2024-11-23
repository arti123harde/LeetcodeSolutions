package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.common.PrintUtil;

public class MoveZeros {

    public static void main(String[] args) {
        int[] array = new int[]{0,1,0,3,12};
        moveZeroes(array);
        PrintUtil.printArray(array);
    }

    public static void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
