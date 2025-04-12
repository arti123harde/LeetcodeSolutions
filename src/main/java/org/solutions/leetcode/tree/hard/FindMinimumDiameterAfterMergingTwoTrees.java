package org.solutions.leetcode.tree.hard;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Arti Harde
 */
public class FindMinimumDiameterAfterMergingTwoTrees {

    public static void main(String[] args) {
        System.out.println(minimumDiameterAfterMerge(new int[][]{{0, 1}, {0, 2}, {0, 3}}, new int[][]{{0,1}}));
    }

    /**
     * Steps to solve this problem :
     * 1. Build Adjacency Matrix for each tree
     * 2. Calculate Diameter of both trees
     * 3. Longest path across both the tress
     * 4. Find maximum of all three diameter lengths
     */
    public static int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        List<List<Integer>> adjMatrix1 = adjacencyMatrix(edges1);
        List<List<Integer>> adjMatrix2 = adjacencyMatrix(edges2);
        int diameter1 = findDiameter(edges1.length+1, adjMatrix1);
        int diameter2 = findDiameter(edges2.length+1, adjMatrix2);
        int combinedDiameter = (int) Math.ceil(diameter1 / 2.0) + (int) Math.ceil(diameter2 / 2.0) + 1;
        return Math.max(Math.max(diameter1, diameter2), combinedDiameter);
    }

    private static List<List<Integer>> adjacencyMatrix(int[][] edges){
        List<List<Integer>> adjMatrix = new ArrayList<>();
        for(int i=0; i<edges.length+1; i++) adjMatrix.add(new ArrayList<>());
        for (int[] edge : edges) {
            adjMatrix.get(edge[0]).add(edge[1]);
            adjMatrix.get(edge[1]).add(edge[0]);
        }
        return adjMatrix;
    }

    private static int findDiameter(int size, List<List<Integer>> adjList) {
        int[] firstBFS = findFarthestNode(adjList, 0, size);
        int farthestNode = firstBFS[0];
        int[] secondBFS = findFarthestNode(adjList, farthestNode, size);
        return secondBFS[1];
    }

    private static int[] findFarthestNode(List<List<Integer>> adjList, int sourceNode, int size) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[size];
        queue.add(sourceNode);
        visited[sourceNode] = true;
        int maximumDistance = 0;
        int farthestNode = sourceNode;
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                int currentNode = queue.remove();
                farthestNode = currentNode;
                for (int neighbor : adjList.get(currentNode)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
            if (!queue.isEmpty()) maximumDistance++;
        }
        return new int[]{farthestNode, maximumDistance};
    }
}
