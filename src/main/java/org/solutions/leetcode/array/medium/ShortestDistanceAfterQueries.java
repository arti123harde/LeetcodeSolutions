package org.solutions.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Arti Harde
 */
public class ShortestDistanceAfterQueries {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestDistanceAfterQueries(5, new int[][]{{2, 4}, {0, 2}, {0, 4}})));
    }

    public static int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < n - 1; i++) graph.get(i).add(i + 1);
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            graph.get(queries[i][0]).add(queries[i][1]);
            answer[i] = bfs(n, graph);
        }
        return answer;
    }

    private static int bfs(int n, List<List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        queue.add(0);
        dist[0] = 0;

        while (!queue.isEmpty()) {
            int city = queue.poll();
            for (int next : graph.get(city)) {
                if (dist[next] > dist[city] + 1) {
                    dist[next] = dist[city] + 1;
                    queue.add(next);
                }
            }
        }
        return dist[n - 1];
    }
}
