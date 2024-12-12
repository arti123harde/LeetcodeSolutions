package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class SemiOrderedPermutation {

    public static void main(String[] args) {
        System.out.println(semiOrderedPermutation(new int[]{2,1,4,3}));
        System.out.println(semiOrderedPermutation(new int[]{2,4,1,3}));
    }

    public static int semiOrderedPermutation(int[] nums) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        int startIndex = -1;
        int endIndex = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < start){
                start = nums[i];
                startIndex = i;
            }
            if(nums[i] > end){
                end = nums[i];
                endIndex = i;
            }
        }
        if(startIndex > endIndex) return startIndex + (nums.length - endIndex - 1) -1;
        return startIndex + (nums.length - endIndex - 1);
    }
}
