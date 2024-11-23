package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.common.PrintUtil;

/**
 * @author Arti Harde
 */
public class CreateTargetArrayInGivenOrder {

    public static void main(String[] args) {
        PrintUtil.printArray(createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
        PrintUtil.printArray(createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0}));
        PrintUtil.printArray(createTargetArray(new int[]{1}, new int[]{0}));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            result = insertElement(result, index[i], nums[i]);
        }
        return result;
    }

    public static int[] insertElement(int[] result, int index, int value){
        int[] ans = new int[result.length];
        for(int i=0; i<index; i++){
            ans[i] = result[i];
        }
        ans[index] = value;
        for(int i=index+1; i<result.length; i++){
            ans[i] = result[i-1];
        }
        return ans;
    }
}