package org.solutions.leetcode.tree.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class MaximumNumberOfKDivisibleComponents {

    public static void main(String[] args) {
        System.out.println(maxKDivisibleComponents(5, new int[][]{{0,2}, {1,2}, {1,3}, {2,4}},
                new int[]{1,8,1,4,4}, 6));
    }

    public static int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<Integer>[] adjMatrix = new ArrayList[n];
        for (int i = 0; i < n; i++) adjMatrix[i] = new ArrayList<>();
        for (int[] edge : edges) {
            adjMatrix[edge[0]].add(edge[1]);
            adjMatrix[edge[1]].add(edge[0]);
        }
        int[] components = new int[1];
        dfs(0, -1, adjMatrix, values, k, components);
        return components[0];
    }

    private static int dfs(int cNode, int pNode,  List<Integer>[] adjMatrix, int[] values, int k, int[] components) {
        int sum = 0;
        for (int neighborNode : adjMatrix[cNode]) {
            if (neighborNode != pNode) {
                sum += dfs(neighborNode, cNode, adjMatrix, values, k, components);
                sum %= k;
            }
        }
        sum += values[cNode];
        sum %= k;
        if (sum == 0) components[0]++;
        return sum;
    }
}
