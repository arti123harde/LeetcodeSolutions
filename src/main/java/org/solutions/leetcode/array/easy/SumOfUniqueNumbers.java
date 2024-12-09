package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class SumOfUniqueNumbers {

    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1,2,3,2}));
        System.out.println(sumOfUnique(new int[]{1,1,1,1,1}));
        System.out.println(sumOfUnique(new int[]{1,2,3,4,5}));
    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] arr = new int[101];
        for(int n : nums) arr[n]++;
        for(int n : nums) if(arr[n] == 1) sum += n;
        return sum;
    }
}
