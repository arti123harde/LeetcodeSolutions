package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class SpecialArrayI {

    public static void main(String[] args) {
        System.out.println(isArraySpecial(new int[]{1}));
        System.out.println(isArraySpecial(new int[]{2,1,4}));
        System.out.println(isArraySpecial(new int[]{4,3,1,6}));
    }

    public static boolean isArraySpecial(int[] nums) {
        if(nums.length <= 1) return true;
        else if(nums.length == 2) return nums[0] % 2 == nums[1] % 2;
        else for(int i=1; i<nums.length-1; i++) if((nums[i] % 2 == nums[i-1] % 2) || (nums[i] % 2 == nums[i+1] % 2)) return false;
        return true;
    }
}
