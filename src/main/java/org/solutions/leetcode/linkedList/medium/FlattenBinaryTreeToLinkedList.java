package org.solutions.leetcode.linkedList.medium;

/**
 * @author Arti Harde
 */
public class FlattenBinaryTreeToLinkedList {

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(6);
        rootNode.left = treeNode1;
        rootNode.right = treeNode4;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode4.right = treeNode5;
        flatten(rootNode);
    }

    public static void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        TreeNode node = root;
        while(node != null){
            if (node.left != null) {
                TreeNode rightmost = node.left;
                while (rightmost.right != null) {
                    rightmost = rightmost.right;
                }
                rightmost.right = node.right;
                node.right = node.left;
                node.left = null;
            }
            node = node.right;
        }
    }



    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}