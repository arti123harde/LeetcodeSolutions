package org.solutions.leetcode.array.easy;

import com.sun.source.tree.Tree;
import org.solutions.leetcode.common.TreeNode;

/**
 * @author Arti Harde
 *
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a
 * height-balanced binary search tree.
 */
public class ConvertSortedArrayToBST {

    public static void main(String[] args) {
        TreeNode.inOrderTraversal(sortedArrayToBST(new int[]{-10,-3,0,5,9}));
        TreeNode.inOrderTraversal(sortedArrayToBST(new int[]{1,3}));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return insertNode(nums, 0, nums.length-1);
    }

    public static TreeNode insertNode(int[] nums, int startIndex, int endIndex){
        if(startIndex > endIndex){
            return null;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = insertNode(nums, startIndex, mid - 1);
        root.right = insertNode(nums, mid + 1, endIndex);
        return root;
    }


}