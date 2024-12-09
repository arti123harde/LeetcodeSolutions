package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class TwoFurthestHousesWithDifferentColors {

    public static void main(String[] args) {
        System.out.println(maxDistance(new int[]{1,1,1,6,1,1,1}));
    }

    public static int maxDistance(int[] colors) {
        if(colors[0] != colors[colors.length-1]) return colors.length-1;
        else{
            int max = Integer.MIN_VALUE;
            for(int i=0; i<colors.length; i++){
                for(int j=i+1; j<colors.length; j++){
                    if(colors[i] != colors[j]) max = Math.max(j-i, max);
                }
            }
            return max;
        }
    }
}
