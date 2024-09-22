package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.utils.PrintUtil;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class DecompressRunLengthEncodedList {

    public static void main(String[] args) {
        PrintUtil.printArray(decompressRLElist(new int[]{1,2,3,4}));
        PrintUtil.printArray(decompressRLElist(new int[]{1,1,2,3}));
    }

    public static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i=0; i<nums.length; i=i+2){
            size += nums[i];
        }
        int[] result = new int[size];
        int index = 0;
        for(int i=0; i<nums.length; i=i+2){
            Arrays.fill(result, index, index + nums[i], nums[i + 1]);
            index += nums[i];
        }
        return result;
    }
}