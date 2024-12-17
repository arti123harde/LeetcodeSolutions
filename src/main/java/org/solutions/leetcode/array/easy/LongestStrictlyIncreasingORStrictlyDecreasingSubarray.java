package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class LongestStrictlyIncreasingORStrictlyDecreasingSubarray {

    public static void main(String[] args) {
        System.out.println(longestMonotonicSubarray(new int[]{1,4,3,3,2}));
    }

    public static int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int max = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                max = Math.max(max, inc);
                inc = 1;
                max = Math.max(max, dec);
                dec = 1;
            } else if(nums[i] < nums[i-1]){
                dec++;
                max = Math.max(max, inc);
                inc = 1;
            }else{
                inc++;
                max = Math.max(max, dec);
                dec = 1;
            }
        }
        return Math.max(max, Math.max(inc, dec));
    }
}
