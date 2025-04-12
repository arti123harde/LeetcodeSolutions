package org.solutions.leetcode.array.medium;

/**
 * @author Arti Harde
 */
public class FindTargetSumWays {

    static int count = 0;

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1,1,1,1,1}, 3));
        System.out.println(findTargetSumWays(new int[]{1}, 1));
    }

    public static int findTargetSumWays(int[] nums, int target) {
        findWays(nums, 0, 0, target);
        return count;
    }

    private static void findWays(int[] nums, int index, int sum, int target) {
        if (index == nums.length) {
            if (sum == target) count++;
        }else {
                findWays(nums, index + 1, sum + nums[index], target);
                findWays(nums, index + 1, sum - nums[index], target);
        }
    }

}
