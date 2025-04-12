package org.solutions.leetcode.hashTable.easy;

import com.sun.source.tree.Tree;
import org.solutions.leetcode.common.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Arti Harde
 */
public class TwoSumIV {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(7);
        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right = t4;
        t2.right = t5;
        System.out.println(findTarget(root, 9));
    }

    public static boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
//        return findTargetDFS(root, k, set);
        return findTargetBFS(root, k, set);
    }


    public static boolean findTargetDFS(TreeNode node, int k, HashSet<Integer> set){
        if(node == null) return false;
        if(set.contains(k - node.val)) return true;
        set.add(node.val);
        return findTargetDFS(node.left, k, set) || findTargetDFS(node.right, k, set);
    }

    public static boolean findTargetBFS(TreeNode node, int k, HashSet<Integer> set){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            if(queue.peek() != null){
                TreeNode treeNode = queue.remove();
                if(set.contains(k - node.val)) return true;
                set.add(treeNode.val);
                queue.add(treeNode.left);
                queue.add(treeNode.right);
            }else queue.remove();
        }
        return false;
    }


}
