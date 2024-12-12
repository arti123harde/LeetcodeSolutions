package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class PointsThatIntersectWithCars {

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(List.of(3,6));
        lists.add(List.of(1,5));
        lists.add(List.of(4,7));
        System.out.println(numberOfPoints(lists));
    }

    public static int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();
        for(List<Integer> list : nums) for (int n=list.get(0); n<=list.get(1); n++) set.add(n);
        return set.size();
    }
}
