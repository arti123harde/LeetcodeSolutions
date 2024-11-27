package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class ValidMountainArray {

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}));
        System.out.println(validMountainArray(new int[]{0,1,2,3,4,8,9,10,11,12,11}));
        System.out.println(validMountainArray(new int[]{0,3,2,1}));
        System.out.println(validMountainArray(new int[]{2,1}));
        System.out.println(validMountainArray(new int[]{3,5,5}));
    }

    public static boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int i = 0;
        while (i < arr.length-1){
            if(arr[i] >= arr[i+1]) break;
            else i++;
        }
        if(i+1 == arr.length || i==0) return false;
        else {
            int j = i;
            while (j < arr.length-1){
                if(arr[j] <= arr[j+1]) return false;
                else j++;
            }
        }
        return true;
    }
}
