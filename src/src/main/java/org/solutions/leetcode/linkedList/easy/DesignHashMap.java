package org.solutions.leetcode.linkedList.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class DesignHashMap {

    public int[] arr = new int[(int)Math.pow(10, 6) + 1];
    public static void main(String[] args) {
        DesignHashMap designHashMap = new DesignHashMap();
        designHashMap.put(1,1);
        designHashMap.put(2,2);
        System.out.println(designHashMap.get(1));
        System.out.println(designHashMap.get(3));
        designHashMap.put(2,1);
        System.out.println(designHashMap.get(2));
        designHashMap.remove(2);
        System.out.println(designHashMap.get(2));
    }

    public DesignHashMap() {
        Arrays.fill(arr, -1);
    }

    public void put(int key, int value) {
        arr[key] = value;
    }

    public int get(int key) {
        return arr[key];
    }

    public void remove(int key) {
        arr[key] = -1;
    }
}