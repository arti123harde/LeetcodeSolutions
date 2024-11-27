package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class ElementAppearingMoreThan25PercInSortedArray {

    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[]{1,1}));
        System.out.println(findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10}));
    }

    public static int findSpecialInteger(int[] arr) {
        //Approach 1
//        if(arr.length == 1) return arr[0];
//        int maxOccuranceExpected = arr.length / 4;
//        int index = 0;
//        while (index < arr.length-1){
//            int count = 1;
//            while (index < arr.length-1 && arr[index] == arr[index+1]){
//                count++;
//                index++;
//            }
//            if(count > maxOccuranceExpected) return arr[index];
//            else if(count == 1) index++;
//        }

        //Approach 2
        int num = arr[0];
        int count = 1;
        int maxOccuranceExpected = arr.length / 4;
        for(int i=1; i<arr.length; i++){
            if(num == arr[i]) count++;
            else count = 1;
            if(count > maxOccuranceExpected) return arr[i];
            num = arr[i];
        }
        return num;
    }
}
