package org.solutions.leetcode.graph.hard;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/**
 * @author Arti Harde
 */
public class ValidPairs {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(validArrangement(new int[][]{{5, 1}, {4, 5}, {11, 9}, {9, 4}})));
        System.out.println(Arrays.deepToString(validArrangement(new int[][]{{1, 3}, {3, 2}, {2, 1}})));
    }

    public static int[][] validArrangement(int[][] pairs) {
        HashMap<Integer, LinkedList<Integer>> adjacencyMatrix = new HashMap<>();
        HashMap<Integer, Integer> inDegree = new HashMap<>();
        HashMap<Integer, Integer> outDegree = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int[] pair : pairs) {
            adjacencyMatrix.putIfAbsent(pair[0], new LinkedList<>());
            adjacencyMatrix.get(pair[0]).add(pair[1]);
            outDegree.put(pair[0], outDegree.getOrDefault(pair[0], 0) + 1);
            inDegree.put(pair[1], inDegree.getOrDefault(pair[1], 0) + 1);
        }
        int startNode = -1;
        for (int node : outDegree.keySet()) {
            if (outDegree.get(node) == inDegree.getOrDefault(node, 0) + 1) {
                startNode = node;
                break;
            }
        }
        if (startNode == -1) startNode = pairs[0][0];
        Stack<Integer> nodeStack = new Stack<>();
        nodeStack.push(startNode);
        while (!nodeStack.empty()) {
            int node = nodeStack.peek();
            if(!adjacencyMatrix.getOrDefault(node, new LinkedList<>()).isEmpty()) {
                int nextNode = adjacencyMatrix.get(node).removeFirst();
                nodeStack.push(nextNode);
            } else {
                result.add(node);
                nodeStack.pop();
            }
        }
        Collections.reverse(result);
        int[][] pairedResult = new int[result.size() - 1][2];
        for (int i = 1; i < result.size(); ++i) {
            pairedResult[i - 1][0] = result.get(i - 1);
            pairedResult[i - 1][1] = result.get(i);
        }
        return pairedResult;
    }
}
