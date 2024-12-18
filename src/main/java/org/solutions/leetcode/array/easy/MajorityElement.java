package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(isMajorityElement(new int[]{2,4,5,5,5,5,5,6,6}, 5));
        System.out.println(isMajorityElement(new int[]{10,100,101,101}, 101));
    }

    public static boolean isMajorityElement(int[] nums, int target) {
        int count = 0;
        for(int n : nums){
            if(target == n) count++;
        }
        return count > (nums.length/2);
    }
}
