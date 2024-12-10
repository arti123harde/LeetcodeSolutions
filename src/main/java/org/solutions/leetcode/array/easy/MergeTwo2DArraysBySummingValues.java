package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class MergeTwo2DArraysBySummingValues {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(mergeArrays(new int[][]{{1, 2}, {2, 3}, {4, 5}},
        new int[][]{{1, 4}, {3, 2}, {4, 1}})));
        System.out.println(Arrays.deepToString(mergeArrays(new int[][]{{2, 4}, {3, 6}, {5, 5}},
                new int[][]{{1, 3}, {4, 3}})));
    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i<nums1.length || j<nums2.length){
            if(i<nums1.length && j<nums2.length) {
                if(nums1[i][0] == nums2[j][0]) {
                    list.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                    i++;
                    j++;
                }else if(nums1[i][0] < nums2[j][0]){
                    list.add(new int[]{nums1[i][0], nums1[i][1]});
                    i++;
                }else{
                    list.add(new int[]{nums2[j][0], nums2[j][1]});
                    j++;
                }
            }else if(i<nums1.length) {
                list.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            }else if(j<nums2.length){
                list.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
        }
        return list.toArray(new int[0][0]);
    }
}
