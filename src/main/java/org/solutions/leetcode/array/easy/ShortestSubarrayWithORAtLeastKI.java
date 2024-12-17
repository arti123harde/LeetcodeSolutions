package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class ShortestSubarrayWithORAtLeastKI {

    public static void main(String[] args) {
        System.out.println(minimumSubarrayLength(new int[]{2,1,8}, 10));
        System.out.println(minimumSubarrayLength(new int[]{1,2,3}, 2));
    }

    public static int minimumSubarrayLength(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= k) return 1;
            else {
                int or = nums[i];
                int lastIndex = 1;
                for(int j=i+1; j<nums.length; j++){
                    or |= nums[j];
                    lastIndex++;
                    if(or >= k){
                        min = Math.min(min, lastIndex);
                        break;
                    }
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
