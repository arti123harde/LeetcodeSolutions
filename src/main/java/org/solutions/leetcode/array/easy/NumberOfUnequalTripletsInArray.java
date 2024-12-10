package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class NumberOfUnequalTripletsInArray {

    public static void main(String[] args) {
        System.out.println(unequalTriplets(new int[]{4,4,2,4,3}));
        System.out.println(unequalTriplets(new int[]{1,1,1,1,1}));
    }

    public static int unequalTriplets(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                if(nums[i] != nums[j]){
                    for(int k=j+1; k<nums.length; k++){
                        if(nums[j] != nums[k] && nums[k] != nums[i]) count++;
                    }
                }
            }
        }
        return count;
    }
}
