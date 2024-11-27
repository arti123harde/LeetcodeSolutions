package org.solutions.leetcode.array.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class LargestPerimeterTriangle {

    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{2,1,2}));
        System.out.println(largestPerimeter(new int[]{1,2,1,10}));
    }

    public static int largestPerimeter(int[] nums) {
        //Approach 1 -Time Limit Exceeded
//        int perimeter = 0;
//        for(int i=0; i<nums.length-2; i++){
//            for(int j=i+1; j<nums.length-1; j++){
//                for(int k=j+1; k<nums.length; k++){
//                    if(nums[i] + nums[j] > nums[k] && nums[i] + nums[k] > nums[j]
//                            && nums[j] + nums[k] > nums[i]){
//                        perimeter = Math.max(perimeter, (nums[i] + nums[j] + nums[k]));
//                    }
//                }
//            }
//        }
//        return perimeter;

        //Approach 2 - Sorting
        Arrays.sort(nums);
        for(int i= nums.length-3; i>=0; i--)
            if (nums[i] + nums[i+1] >nums[i+2]) return nums[i] + nums[i+1] + nums[i+2];
        return 0;
    }
}
