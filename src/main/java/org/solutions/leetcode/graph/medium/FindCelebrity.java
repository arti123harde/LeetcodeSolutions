package org.solutions.leetcode.graph.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class FindCelebrity {

    public static void main(String[] args) {
        System.out.println(findCelebrity(new int[][]{{1,1,1}, {1,1,0}, {0,0,1}}, 3));
        System.out.println(findCelebrity(new int[][]{{1,1}, {0, 1}}, 2));
        System.out.println(findCelebrity(new int[][]{{1,1,0}, {0, 1, 0}, {1, 1, 1}}, 3));
    }

    public static int findCelebrity(int[][] graph, int n) {
        for(int i=0; i<n; i++){
            boolean a = true;
            for(int j=0; j<n; j++){
                if(i!=j && (graph[i][j] != 0 || graph[j][i] == 0)) {
                    a = false;
                    break;
                }
            }
            if(a) return i;
        }
       return -1;
    }
}
