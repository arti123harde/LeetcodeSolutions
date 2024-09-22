package org.solutions.leetcode.linkedList.easy;

import org.solutions.leetcode.common.ListNode;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        System.out.println(reverseList(ListNode.createList(Arrays.asList(1,2,3,4,5))));
        System.out.println(reverseList(ListNode.createList(Arrays.asList(1,2))));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}