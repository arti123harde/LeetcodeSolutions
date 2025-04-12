package org.solutions.leetcode.tree.medium;

import org.solutions.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Arti Harde
 */
public class FindLargestValueInEachTreeRow {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(9);
        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right = t4;
        t2.right = t5;
        System.out.println(largestValues(root));
    }

    public static List<Integer> largestValues(TreeNode root) {
        if(root == null) return Collections.emptyList();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            result.add(max);
        }
        return result;
    }
}
