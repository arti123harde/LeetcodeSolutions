package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class DuplicateZeros {

    public static void main(String[] args) {
        duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }

    public static void duplicateZeros(int[] arr) {
        //Time Complexity - O(N ^ 2)
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == 0) {
//                for(int j=arr.length-1; j>i; j--){
//                    arr[j] = arr[j-1];
//                }
//                i++;
//            }
//        }

        //Time Complexity - O(N)
        int possibleDups = 0;
        int length = arr.length - 1;
        for (int left = 0; left <= length - possibleDups; left++) {
            if (arr[left] == 0) {
                if (left == length - possibleDups) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }
        int last = length - possibleDups;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}
