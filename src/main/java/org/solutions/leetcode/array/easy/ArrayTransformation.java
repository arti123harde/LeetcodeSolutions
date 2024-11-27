package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class ArrayTransformation {

    public static void main(String[] args) {
        System.out.println(transformArray(new int[]{1,6,3,4,3,5}));
        System.out.println(transformArray(new int[]{2,1,2,1,1,2,2,1}));
        System.out.println(transformArray(new int[]{6,2,3,4}));
    }

    public static List<Integer> transformArray(int[] arr) {
        boolean operation = true;
        while (operation){
            operation = false;
            int[] temp = arr.clone();
            for(int i=1; i<arr.length-1; i++){
                if(arr[i] < arr[i-1] && arr[i] < arr[i+1]){
                    temp[i]++;
                    operation = true;
                }else if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                   temp[i]--;
                    operation = true;
                }
            }
            arr = temp;
        }
        return Arrays.stream(arr).boxed().toList();
    }
}
