package org.solutions.leetcode.array.easy;

public class MaximumAverageSubarrayI {

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
        System.out.println(findMaxAverage(new int[]{4,0,4,3,3}, 5));
        System.out.println(findMaxAverage(new int[]{-1}, 1));
        System.out.println(findMaxAverage(new int[]{5}, 1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double max = 0.0;

        //Approach 1 - Time Complexity O(n * k)
//        for(int i=0; i<nums.length-k+1; i++){
//            int sum = 0;
//            for(int j=i; j<i+k; j++){
//                sum += nums[j];
//            }
//            if(i == 0){
//                max = (double) sum/k;
//            }else{
//                max = Math.max((double) sum/k, max);
//            }
//        }

        //Approach 2 - Time Complexity O(n)
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        max = (double) sum/k;
        if(nums.length > k){
            for(int i=k; i<nums.length; i++){
                sum = ((sum - nums[i-k]) + nums[i]);
                max = Math.max((double) sum/k, max);
            }
        }
        return max;
    }
}
