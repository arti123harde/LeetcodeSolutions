package org.solutions.leetcode.array.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * @author Arti Harde
 */
public class NumberOfStudentsUnableToEatLunch {

    public static void main(String[] args) {
        System.out.println(countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));
        System.out.println(countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1}));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> deque = new ArrayDeque<>();
        for(int s : students) deque.addLast(s);
        int index = 0;
        while (index < sandwiches.length && deque.contains(sandwiches[index])){
            int st = deque.pop();
            if(sandwiches[index] == st) index++;
            else deque.addLast(st);
        }
        return deque.size();
    }
}
