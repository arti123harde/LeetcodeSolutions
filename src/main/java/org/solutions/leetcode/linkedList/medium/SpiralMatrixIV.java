package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.linkedList.ListNode;
import org.solutions.leetcode.string.easy.PrintUtil;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class SpiralMatrixIV {

    public static void main(String[] args) {
        PrintUtil.printArray(spiralMatrix(3, 5, ListNode.createList(Arrays.asList(3,0,2,6,8,1,7,9,4,2,5,5,0))));
        PrintUtil.printArray(spiralMatrix(1, 4, ListNode.createList(Arrays.asList(0,1,2))));
    }

    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];
        for(int[] row: arr){
            Arrays.fill(row,-1);
        }
        int top = 0, left = 0, right = n-1, bottom = m-1;
        while(head != null){
            for(int i=left; i<=right && head != null; i++){
                arr[top][i] = head.val;
                head = head.next;
            }
            top++;
            for(int i=top; i<=bottom && head != null; i++){
                arr[i][right] = head.val;
                head = head.next;
            }
            right--;
            for(int i=right; i>=left && head != null; i--){
                arr[bottom][i] = head.val;
                head = head.next;
            }
            bottom--;
            for(int i=bottom; i>=top && head != null; i--){
                arr[i][left] = head.val;
                head = head.next;
            }
            left++;
        }
        return arr;
    }
}