package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class DivideAnArrayIntoSubarraysWithMinimumCostI {

    public static void main(String[] args) {
        System.out.println(minimumCost(new int[]{1,2,3,12}));
    }

    public static int minimumCost(int[] nums) {
        if(nums.length == 3) return nums[0] + nums[1] + nums[2];
        else {
            int n1 = nums[0];
            int n2 = 51;
            int n3 = 51;
            for(int i=1; i<nums.length; i++){
                if(nums[i] < n2) {
                    n3 = n2;
                    n2 = nums[i];
                }else if(nums[i] < n3){
                    n3 = nums[i];
                }
            }
            return n1 + n2 + n3;
        }
    }
}
