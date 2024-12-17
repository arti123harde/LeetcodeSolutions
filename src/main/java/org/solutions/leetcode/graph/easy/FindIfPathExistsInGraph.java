package org.solutions.leetcode.graph.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class FindIfPathExistsInGraph {

    public static void main(String[] args) {
        System.out.println(validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}},0, 2));
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] visited = new boolean[n];
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], val -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], val -> new ArrayList<>()).add(edge[0]);
        }
        return dfs(graph, visited, source, destination);
    }

    private static boolean dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int currNode, int destination) {
        if (currNode == destination) return true;
        if (!visited[currNode]) {
            visited[currNode] = true;
            for (int nextNode : graph.get(currNode)) if (dfs(graph, visited, nextNode, destination)) return true;
        }
        return false;
    }
}
