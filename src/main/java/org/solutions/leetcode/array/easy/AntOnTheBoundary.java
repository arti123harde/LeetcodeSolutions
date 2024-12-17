package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class AntOnTheBoundary {

    public static void main(String[] args) {
        System.out.println(returnToBoundaryCount(new int[]{2,3,-5}));
        System.out.println(returnToBoundaryCount(new int[]{3,2,-3,-4}));
    }

    public static int returnToBoundaryCount(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int n : nums){
            sum += n;
            if(sum == 0) count++;
        }
        return count;
    }
}
