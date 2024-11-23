package org.solutions.leetcode.array.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println(generate(6));
        System.out.println(generate(7));
        System.out.println(generate(5));
        System.out.println(generate(1));
        System.out.println(generate(2));
        System.out.println(generate(4));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();
        results.add(List.of(1));
        for(int j=0; j<numRows-1; j++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            List<Integer> lastList = results.get(results.size()-1);
            for(int i=0; i<lastList.size()-1; i++){
                list.add(lastList.get(i) + lastList.get(i+1));
            }
            list.add(1);
            results.add(list);
        }
        return results;
    }
}