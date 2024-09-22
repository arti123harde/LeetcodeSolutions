package org.solutions.leetcode;

import java.sql.SQLOutput;

/**
 * @author Arti Harde
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }

    public static int removeDuplicates(int[] nums) {
        int i=0;
        int lastIndex=0;
        int num = nums[0];
        while(i < nums.length){
            if(nums[i] != num){
                num = nums[i];
                nums[lastIndex+1]=num;
                lastIndex++;
            }
            i++;
        }
        int j=lastIndex+1;
        while (j < nums.length){
            nums[j] = Integer.MIN_VALUE;
            j++;
        }
        return lastIndex+1;
    }
}