package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.common.PrintUtil;

/**
 * @author Arti Harde
 */
public class MergeSortedArrays {

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        merge(new int[]{0}, 0, new int[]{1}, 1);
        merge(new int[]{1}, 1, new int[]{}, 0);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m+n-1;
        int p1 = m-1;
        int p2 = n-1;
        for(int i=p; i>=0; i--){
            if(p2 < 0){
                break;
            }
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1];
                p1--;
            }else{
                nums1[i] = nums2[p2];
                p2--;
            }
        }
        PrintUtil.printArray(nums1);
    }
}