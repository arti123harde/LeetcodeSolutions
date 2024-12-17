package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Arti Harde
 */
public class AppleRedistributionIntoBoxes {

    public static void main(String[] args) {
        System.out.println(minimumBoxes(new int[]{1,3,2}, new int[]{4,3,1,5,2}));
        System.out.println(minimumBoxes(new int[]{5,5,5}, new int[]{2,4,2,7}));
    }

    public static int minimumBoxes(int[] apple, int[] capacity) {
        int count = 0;
        for(int n : apple) count += n;
        Arrays.sort(capacity);
        for(int i=capacity.length-1; i>=0; i--){
            count -= capacity[i];
            if(count <= 0) return capacity.length - i;
        }
        return capacity.length;
    }
}
