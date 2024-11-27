package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class FairCandySwap {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1,2}, new int[]{2,3})));
        System.out.println(Arrays.toString(fairCandySwap(new int[]{2}, new int[]{1,3})));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int i = 0;
        int j = 0;
        int asum = 0;
        int bsum = 0;
        Set<Integer> bCandies = new HashSet<>();
        while (i < aliceSizes.length || j < bobSizes.length){
            if(i < aliceSizes.length){
                asum += aliceSizes[i];
                i++;
            }
            if(j < bobSizes.length){
                bCandies.add(bobSizes[j]);
                bsum += bobSizes[j];
                j++;
            }
        }
        int diff = (bsum - asum)/2;
        for(int n: aliceSizes){
            if(bCandies.contains(diff + n)) return new int[]{n, diff + n};
        }
        return null;
    }
}
