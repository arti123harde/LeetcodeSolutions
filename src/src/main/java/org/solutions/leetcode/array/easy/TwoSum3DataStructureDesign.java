package org.solutions.leetcode.array.easy;

import java.util.*;

public class TwoSum3DataStructureDesign {

    Map<Integer, Integer> map;

    public static void main(String[] args) {
        TwoSum3DataStructureDesign obj = new TwoSum3DataStructureDesign();
        obj.add(0);
        System.out.println(obj.find(0));
//        obj.add(1);
//        obj.add(3);
//        obj.add(5);
//        System.out.println(obj.find(4));
//        System.out.println(obj.find(7));
//        System.out.println(obj.find(6));
//        System.out.println(obj.find(8));
    }

    public TwoSum3DataStructureDesign() {
        map = new HashMap<>();
    }

    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {
        for(Integer num : map.keySet()){
            int num2 = value - num;
            if((num != num2 && (map.containsKey(num2))) || (num == num2 && map.get(num) > 1)) return true;
        }
        return false;
    }
}
