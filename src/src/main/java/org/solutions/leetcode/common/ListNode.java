package org.solutions.leetcode.common;

import java.util.List;

/**
 * @author Arti Harde
 */
public class ListNode {

    public int val;
    public ListNode next;
    private ListNode() {

    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public static ListNode createList(List<Integer> list){
        ListNode head = null;
        ListNode prev = null;
        for (Integer integer : list) {
            ListNode newNode = new ListNode(integer);
            if (head == null) {
                head = newNode;
                prev = newNode;
            } else {
                prev.next = newNode;
                prev = prev.next;
            }
        }
        return head;
    }

}