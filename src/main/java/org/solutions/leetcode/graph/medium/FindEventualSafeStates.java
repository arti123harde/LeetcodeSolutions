package org.solutions.leetcode.graph.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class FindEventualSafeStates {

    public static void main(String[] args) {
        System.out.println(eventualSafeNodes(new int[][]{{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}}));
    }

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] visit = new boolean[n];
        boolean[] stack = new boolean[n];
        for (int i = 0; i < n; i++)
            dfs(i, graph, visit, stack);
        List<Integer> safeNodes = new ArrayList<>();
        for (int i = 0; i < n; i++) if (!stack[i]) safeNodes.add(i);
        return safeNodes;
    }

    public static boolean dfs(int node, int[][] adj, boolean[] visit, boolean[] stack) {
        if (stack[node]) return true;
        if (visit[node]) return false;
        visit[node] = true;
        stack[node] = true;
        for (int neighbor : adj[node]) if (dfs(neighbor, adj, visit, stack)) return true;
        stack[node] = false;
        return false;
    }
}
