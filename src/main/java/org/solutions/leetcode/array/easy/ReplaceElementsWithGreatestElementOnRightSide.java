package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class ReplaceElementsWithGreatestElementOnRightSide {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));
        System.out.println(Arrays.toString(replaceElements(new int[]{400})));
    }

    public static int[] replaceElements(int[] arr) {
        //Approach 1
//        for(int i=0; i<arr.length-1; i++){
//            int max = arr[i+1];
//            for(int j=i+1; j<arr.length; j++){
//                max = Math.max(max, arr[j]);
//            }
//            arr[i] = max;
//        }
//        arr[arr.length - 1] = -1;
//        return arr;

        //Approach 2
        if(arr.length == 1) return new int[]{-1};
        int[] ans = new int[arr.length];
        int max = -1;
        for(int i = arr.length -1 ; i >= 0 ; i--) {
            ans[i] = max;
            max = Math.max(max, arr[i]);
        }
        return ans;
    }
}
