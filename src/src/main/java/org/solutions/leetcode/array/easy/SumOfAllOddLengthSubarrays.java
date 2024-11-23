package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class SumOfAllOddLengthSubarrays {

    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[]{1,4,2,5,3}));
        System.out.println(sumOddLengthSubarrays(new int[]{1,2}));
        System.out.println(sumOddLengthSubarrays(new int[]{10,11,12}));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if((i+j-1) % 2 != 0) result += sum;
            }
        }
        return result;
    }

}