package org.solutions.leetcode.common;

import org.solutions.leetcode.array.easy.ConvertSortedArrayToBST;

/**
 * @author Arti Harde
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;
    public  TreeNode next;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    public static void inOrderTraversal(TreeNode root){
        if(root != null){
            if(root.left != null){
                inOrderTraversal(root.left);
            }
            System.out.print(root.val + " --> ");
            if(root.right != null){
                inOrderTraversal(root.right);
            }
        }
    }

}