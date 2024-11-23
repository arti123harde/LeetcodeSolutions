package org.solutions.leetcode.array.easy;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 *
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 */
public class PascalsTriangle2 {

    public static void main(String[] args) {
        System.out.println(getRow(30));
        System.out.println(getRow(3));
        System.out.println(getRow(5));
        System.out.println(getRow(4));

    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for(int i=1; i<=rowIndex; i++){
            int lastElement = result.get(result.size()-1);
            int nextElement = (lastElement * (rowIndex - i + 1))/i;
            result.add(nextElement);
        }
        return result;
    }

}