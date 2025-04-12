package org.solutions.leetcode.tree.medium;

import com.sun.source.tree.Tree;
import org.solutions.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @author Arti Harde
 */
public class MinimumNumberOfOperationsToSortABinaryTreeByLevel {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(7);
        TreeNode t3 = new TreeNode(6);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(8);
        TreeNode t6 = new TreeNode(9);
        TreeNode t7 = new TreeNode(5);
        TreeNode t8 = new TreeNode(10);
        root.left = t1;
        root.right = t4;
        t1.left = t2;
        t1.right = t3;
        t4.left = t5;
        t4.right = t7;
        t5.left = t6;
        t7.left = t8;
        System.out.println(minimumOperations(root));
    }

    public static int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int totalSwaps = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int[] levelValues = new int[levelSize];
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelValues[i] = node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            totalSwaps += getMinSwaps(levelValues);
        }
        return totalSwaps;
    }

    private static int getMinSwaps(int[] original) {
        int swaps = 0;
        int[] target = original.clone();
        Arrays.sort(target);
        Map<Integer, Integer> position = new HashMap<>();
        for (int i = 0; i < original.length; i++) position.put(original[i], i);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != target[i]) {
                swaps++;
                int currentPosition = position.get(target[i]);
                position.put(original[i], currentPosition);
                original[currentPosition] = original[i];
            }
        }
        return swaps;
    }
}
