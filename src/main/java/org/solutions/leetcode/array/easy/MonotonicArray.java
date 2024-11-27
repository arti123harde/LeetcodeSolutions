package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MonotonicArray {

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1,2,2,3}));
        System.out.println(isMonotonic(new int[]{11,11,9,4,3,3,3,1,-1,-1,3,3,3,5,5,5}));
        System.out.println(isMonotonic(new int[]{6,5,4,4}));
        System.out.println(isMonotonic(new int[]{1,3,2}));
    }

    public static boolean isMonotonic(int[] nums) {
        int compare = 0;
        for(int i=0; i<nums.length-1; i++){
            int diff = Integer.compare(nums[i], nums[i+1]);
            if (diff != 0) {
                if (diff != compare && compare != 0) return false;
                compare = diff;
            }
        }
        return true;
    }
}
