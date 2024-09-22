package org.solutions.leetcode.linkedList.easy;

import org.solutions.leetcode.linkedList.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class LinkedListFrequency {

    public static void main(String[] args) {
        System.out.println(frequenciesOfElements(ListNode.createList(Arrays.asList(1,1,2,1,2,3))));
    }

    public static ListNode frequenciesOfElements(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        ListNode node = head;
        while (node != null){
            map.put(node.val, map.getOrDefault(node.val, 0) + 1);
            node = node.next;
        }
        return ListNode.createList(new ArrayList<>(map.values()));
    }
}