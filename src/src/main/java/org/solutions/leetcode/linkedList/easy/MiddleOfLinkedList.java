package org.solutions.leetcode.linkedList.easy;

import org.solutions.leetcode.common.ListNode;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MiddleOfLinkedList {

    public static void main(String[] args) {
        System.out.println(middleNode(ListNode.createList(Arrays.asList(1,2,3,4,5,6))));
        System.out.println(middleNode(ListNode.createList(Arrays.asList(1,2,3))));
        System.out.println(middleNode(ListNode.createList(Arrays.asList(1,2,3,4,5))));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next != null){
            return slow.next;
        }else{
            return slow;
        }
    }
}