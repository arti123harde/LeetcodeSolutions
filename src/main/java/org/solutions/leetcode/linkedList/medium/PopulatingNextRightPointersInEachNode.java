package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;
import org.solutions.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

import static org.solutions.leetcode.common.TreeNode.inOrderTraversal;
import static org.solutions.leetcode.tree.easy.BinaryTreePreorderTraversal.preOrderTraversal;

/**
 * @author Arti Harde
 */
public class PopulatingNextRightPointersInEachNode {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(6);
        TreeNode t6 = new TreeNode(7);
        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right = t4;
        t2.left = t5;
        t2.right = t6;
        System.out.println(preOrderTraversal(connect(root)));
    }

    public static TreeNode connect(TreeNode root) {
        if(root == null) return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                if(i < size-1) node.next = queue.peek();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        return root;
    }
}
