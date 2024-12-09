package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MaximumUnitsOnTruck {

    public static void main(String[] args) {
        System.out.println(maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4));
        System.out.println(maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int units = 0;
        int index = 0;
        while (truckSize > 0){
            if(truckSize >= boxTypes[index][0]) {
                units += boxTypes[index][0] * boxTypes[index][1];
                truckSize -= boxTypes[index][0];
            }else{
                units += truckSize * boxTypes[index][1];
                truckSize = 0;
            }
            index++;
        }
        return units;
    }
}
