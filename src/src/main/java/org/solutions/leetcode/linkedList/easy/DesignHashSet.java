package org.solutions.leetcode.linkedList.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class DesignHashSet {

    public int[] arr = new int[(int)Math.pow(10, 6) + 1];

    public DesignHashSet() {
        Arrays.fill(arr, -1);
    }

    public static void main(String[] args) {
        DesignHashSet designHashSet = new DesignHashSet();
        System.out.println(designHashSet.get(100));
        designHashSet.add(1);
        designHashSet.add(2);
        designHashSet.contains(1);
        designHashSet.contains(3);
        designHashSet.add(2);
        designHashSet.contains(2);
        designHashSet.remove(2);
        designHashSet.contains(2);
    }

    public int get(int key) {
        return arr[key];
    }

    public void add(int key) {
        arr[key] = key;
    }

    public void remove(int key) {
        arr[key] = 0;
    }

    public boolean contains(int key) {
        return arr[key] == key;
    }
}