package org.solutions.leetcode.graph.hard;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Arti Harde
 */
public class MaximumInvitations {

    public static void main(String[] args) {
        System.out.println(maximumInvitations(new int[]{2,2,1,2}));
        System.out.println(maximumInvitations(new int[]{1,2,0}));
    }

    public static int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        int[] inDegree = new int[n];
        for (int j : favorite) inDegree[j]++;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; ++i) if (inDegree[i] == 0) q.offer(i);
        int[] depth = new int[n];
        Arrays.fill(depth, 1);
        while (!q.isEmpty()) {
            int currentNode = q.poll();
            int nextNode = favorite[currentNode];
            depth[nextNode] = Math.max(depth[nextNode], depth[currentNode] + 1);
            if (--inDegree[nextNode] == 0) q.offer(nextNode);
        }
        int longestCycle = 0;
        int twoCycleInvitations = 0;
        for (int i = 0; i < n; ++i) {
            if (inDegree[i] == 0) continue;
            int cycleLength = 0;
            int current = i;
            while (inDegree[current] != 0) {
                inDegree[current] = 0;
                cycleLength++;
                current = favorite[current];
            }
            if (cycleLength == 2) twoCycleInvitations += depth[i] + depth[favorite[i]];
            else  longestCycle = Math.max(longestCycle, cycleLength);
        }
        return Math.max(longestCycle, twoCycleInvitations);
    }
}
