package org.solutions.leetcode.string.medium;

import org.solutions.leetcode.common.PrintUtil;

/**
 * @author Arti Harde
 */
public class MinimumNumberOperationsToMoveAllBallsToEachBox {

    public static void main(String[] args) {
        PrintUtil.printArray(minOperations("110"));
        PrintUtil.printArray(minOperations("001011"));
    }

    public static int[] minOperations(String boxes) {
        int[] operations = new int[boxes.length()];

        // Approach 1 - Time Complexity O(N^2)
//        for(int i =0; i<boxes.length(); i++){
//            int count = 0;
//            for(int j=0; j<boxes.length(); j++){
//                if(i!=j && boxes.charAt(j)=='1'){
//                    count = count + Math.abs(j-i);
//                }
//            }
//            operations[i] = count;
//        }


        // Approach 2 - Time Complexity O(N)
        int count = 0;
        int k = 0;
        for (int i = 0; i < boxes.length(); i++) {
            operations[i] = count;
            k += boxes.charAt(i) - '0';
            count += k;
        }
        count = 0;
        k = 0;
        for (int i =  boxes.length() - 1; i >= 0; i--) {
            operations[i] += count;
            k += boxes.charAt(i) - '0';
            count += k;
        }
        return operations;
    }
}