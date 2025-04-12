package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;

import java.util.List;

/**
 * @author Arti Harde
 */
public class SwapNodesInPairs {

    public static void main(String[] args) {
        System.out.println(swapPairs(ListNode.createList(List.of(1,2,3,4))));
    }

    public static ListNode swapPairs(ListNode head) {
        //Approach 1 - Iteration
//        ListNode dummy = new ListNode(-1);
//        dummy.next = head;
//        ListNode prevNode = dummy;
//        while ((head != null) && (head.next != null)) {
//            ListNode firstNode = head;
//            ListNode secondNode = head.next;
//            prevNode.next = secondNode;
//            firstNode.next = secondNode.next;
//            secondNode.next = firstNode;
//            prevNode = firstNode;
//            head = firstNode.next;
//        }
//        return dummy.next;

        //Approach 2 - Recursion
        if(head == null || head.next == null) return head;
        ListNode fNode = head;
        ListNode sNode = head.next;
        fNode.next = swapPairs(sNode.next);
        sNode.next = fNode;
        return sNode;
    }
}
