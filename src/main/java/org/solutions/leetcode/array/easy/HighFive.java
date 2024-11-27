package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Arti Harde
 */
public class HighFive {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(highFive(new int[][]{{1, 91}, {1, 92}, {2, 93}, {2, 97},
                {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}})));
    }

    public static int[][] highFive(int[][] items) {
        Map<Integer, Queue<Integer>> map = new HashMap<>();
        for(int[] i : items){
            if(!map.containsKey(i[0])) map.put(i[0], new PriorityQueue<>((a, b) -> b - a));
            map.get(i[0]).add(i[1]);
        }
        int[][] result = new int[map.keySet().size()][2];
        int index = 0;
        for(int k : map.keySet()){
            int i = 0;
            int sum = 0;
            while (i < 5) {
                sum += map.get(k).remove();
                i++;
            }
            result[index][0] = k;
            result[index][1] = sum / 5;
            index++;
        }
        return result;
    }
}
