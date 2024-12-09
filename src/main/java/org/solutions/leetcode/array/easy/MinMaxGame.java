package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MinMaxGame {

    public static void main(String[] args) {
        System.out.println(minMaxGame(new int[]{70,38,21,22}));
        System.out.println(minMaxGame(new int[]{1,3,5,2,4,8,2,2}));
        System.out.println(minMaxGame(new int[]{3}));
    }

    public static int minMaxGame(int[] nums) {
        if(nums.length == 1) return nums[0];
        else if(nums.length == 2) return Math.min(nums[0], nums[1]);
        int iterations = nums.length;
        while (iterations > 1){
            for(int i=0; i<iterations/2; i++) {
                nums[i] = (i % 2) == 1 ? Math.max(nums[2 * i], nums[2 * i + 1]) : Math.min(nums[2 * i], nums[2 * i + 1]);
            }
            iterations -= iterations/2;
        }
        return nums[0];
    }
}
