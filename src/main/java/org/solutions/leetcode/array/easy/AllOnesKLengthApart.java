package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class AllOnesKLengthApart {

    public static void main(String[] args) {
        System.out.println(kLengthApart(new int[]{1,0,0,1,0,1}, 2));
        System.out.println(kLengthApart(new int[]{1,0,0,0,1,0,0,1}, 2));
    }

    public static boolean kLengthApart(int[] nums, int k) {
        int lastPosition = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                if(lastPosition != -1 && (i-lastPosition) < k+1) return false;
                lastPosition = i;
            }
        }
        return true;
    }
}
