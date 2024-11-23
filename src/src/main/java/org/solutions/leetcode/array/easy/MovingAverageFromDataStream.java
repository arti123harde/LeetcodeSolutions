package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

public class MovingAverageFromDataStream {

    int size;
    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        MovingAverageFromDataStream obj = new MovingAverageFromDataStream(3);
        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));
    }

    public MovingAverageFromDataStream(int size) {
        this.size = size;
    }

    public double next(int val) {
        list.add(val);
        int n = Math.min(size, list.size());
        int count = 0;
        for(int i=list.size()-1; i>=(list.size()-n); i--){
            count += list.get(i);
        }
        return (double) count /n;
    }
}
