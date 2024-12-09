package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Arti Harde
 */
public class MergeSimilarItems {

    public static void main(String[] args) {
        System.out.println(mergeSimilarItems(new int[][]{{1, 1}, {4, 5}, {3, 8}}, new int[][]{{3, 1}, {1, 5}}));
    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        for(int[] i1 : items1) map.put(i1[0], map.getOrDefault(i1[0], 0) + i1[1]);
        for(int[] i2 : items2) map.put(i2[0], map.getOrDefault(i2[0], 0) + i2[1]);
        for(int k : map.keySet()){
            result.add(List.of(k, map.get(k)));
        }
        return result;
    }
}