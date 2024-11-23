package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.common.PrintUtil;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch {

    public static void main(String[] args) {
        PrintUtil.printArray(findErrorNums(new int[]{1,5,3,2,2,7,6,4,8,9}));
        PrintUtil.printArray(findErrorNums(new int[]{3,2,3,4,6,5}));
        PrintUtil.printArray(findErrorNums(new int[]{3,3,1}));
        PrintUtil.printArray(findErrorNums(new int[]{3,2,2}));
        PrintUtil.printArray(findErrorNums(new int[]{1,2,2,4}));
        PrintUtil.printArray(findErrorNums(new int[]{1,1}));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)) result[0] = n;
            set.add(n);
        }
        for(int i=1; i<=nums.length; i++){
            if(!set.contains(i)) result[1] = i;
        }
        return result;
    }
}
