package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class PartitionArrayIntoThreePartsWithEqualSum {

    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[]{0,2,1,-6,6,-7,9,1,2,0,1}));
        System.out.println(canThreePartsEqualSum(new int[]{0,2,1,-6,6,7,9,-1,2,0,1}));
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int n : arr) sum += n;
        if(sum % 3 != 0) return false;
        int target = sum / 3;
        int count = 0;
        int sum1 = 0;
        for(int n : arr){
            sum1 += n;
            if(sum1 == target) {
                count++;
                sum1 = 0;
            }
        }
        return count >= 3;
    }
}
