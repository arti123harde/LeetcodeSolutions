package org.solutions.leetcode.tree.medium;

import org.solutions.leetcode.common.TreeNode;

import static org.solutions.leetcode.tree.easy.BinaryTreePreorderTraversal.preOrderTraversal;

/**
 * @author Arti Harde
 */
public class ReverseOddLevelsOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(13);
        TreeNode t5 = new TreeNode(21);
        TreeNode t6 = new TreeNode(34);
        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right = t4;
        t2.left = t5;
        t2.right = t6;
        System.out.println(preOrderTraversal(reverseOddLevels(root)));
    }

    public static TreeNode reverseOddLevels(TreeNode root) {
        reverse(root.left, root.right, 0);
        return root;
    }

    private static void reverse(TreeNode left, TreeNode right, int height){
        if(left == null || right == null) return;
        if(height % 2 == 0){
            int temp = right.val;
            right.val = left.val;
            left.val = temp;
        }
        reverse(left.left, right.right, height+1);
        reverse(left.right, right.left, height+1);
    }

}
