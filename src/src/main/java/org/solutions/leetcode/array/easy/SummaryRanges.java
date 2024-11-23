package org.solutions.leetcode.array.easy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,10,12,15,16}));
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}));
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0){
            return result;
        }else if(nums.length == 1){
            result.add(String.valueOf(nums[0]));
        }else {
            String s1 = String.valueOf(nums[0]);
            for(int i=1; i<=nums.length; i++){
                if(i== nums.length || nums[i] - nums[i-1] != 1){
                    if(!s1.equals(String.valueOf(nums[i-1]))){
                        result.add(s1 + "->" + nums[i - 1]);
                    }else {
                        result.add(s1);
                    }
                    if(i != nums.length) s1 = String.valueOf(nums[i]);
                }
            }
        }
        return result;
    }
}
