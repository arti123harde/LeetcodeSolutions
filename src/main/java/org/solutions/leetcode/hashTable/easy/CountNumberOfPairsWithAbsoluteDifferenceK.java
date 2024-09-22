package org.solutions.leetcode.hashTable.easy;

/**
 * @author Arti Harde
 */
public class CountNumberOfPairsWithAbsoluteDifferenceK {

    public static void main(String[] args) {
        System.out.println(countKDifference(new int[]{1,2,2,1}, 1));
        System.out.println(countKDifference(new int[]{1,3}, 3));
        System.out.println(countKDifference(new int[]{3,2,1,5,4}, 2));
    }

    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(Math.abs(nums[i]-nums[j]) == k){
                    count++;
                }
            }
        }
        return count;
    }
}