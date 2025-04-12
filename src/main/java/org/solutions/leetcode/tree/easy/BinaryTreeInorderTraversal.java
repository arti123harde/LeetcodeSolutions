package org.solutions.leetcode.tree.easy;

import org.solutions.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class BinaryTreeInorderTraversal {

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
        inorderTraversal(root);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(result, root);
        return result;
    }

    private static void inOrder(List<Integer> result, TreeNode node){
        if(node == null) return;
        inOrder(result, node.left);
        result.add(node.val);
        inOrder(result, node.right);
    }
}
