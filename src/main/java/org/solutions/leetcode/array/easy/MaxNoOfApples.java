package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MaxNoOfApples {

    public static void main(String[] args) {
        System.out.println(maxNumberOfApples(new int[]{100,200,150,1000}));
        System.out.println(maxNumberOfApples(new int[]{900,950,800,1000,700,800}));
    }

    public static int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int sum = 0;
        for(int i=0; i<weight.length; i++) if(sum + weight[i] > 5000) return i; else sum += weight[i];
        return weight.length;
    }
}
