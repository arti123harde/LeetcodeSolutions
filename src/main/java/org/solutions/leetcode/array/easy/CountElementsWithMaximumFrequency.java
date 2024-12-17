package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CountElementsWithMaximumFrequency {

    public static void main(String[] args) {
        System.out.println(maxFrequencyElements(new int[]{1,2,2,3,1,4}));
        System.out.println(maxFrequencyElements(new int[]{1,2,3,4,5}));
    }

    public static int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        for(int n : nums) arr[n]++;
        int frequency = 0;
        int count = 0;
        for(int n : nums){
            if(frequency < arr[n]){
                count = 1;
                frequency = arr[n];
            }else if(frequency == arr[n]) count++;
        }
        return count;
    }
}
