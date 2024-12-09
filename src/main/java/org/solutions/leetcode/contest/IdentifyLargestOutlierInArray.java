package org.solutions.leetcode.contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class IdentifyLargestOutlierInArray {

    public static void main(String[] args) {
        System.out.println(getLargestOutlier(new int[]{2,3,5,10}));
        System.out.println(getLargestOutlier(new int[]{-108,-108,-517}));
        System.out.println(getLargestOutlier(new int[]{562,-853,-638,-215}));
    }

    public static int getLargestOutlier(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            hm.put(nums[i], i);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int rem = sum - n;
            if(rem%2 == 0){
                int sumElement = rem/2;
                if(hm.containsKey(sumElement)){
                    if(hm.get(sumElement) != i){
                        if(n > max){
                            max = n;
                        }
                    }
                }
            }
        }
        return max;
    }


}
