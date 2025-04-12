package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;

import java.util.List;

/**
 * @author Arti Harde
 */
public class RotateList {

    public static void main(String[] args) {
        System.out.println(rotateRight(ListNode.createList(List.of(1,2,3,4,5)), 2));
        System.out.println(rotateRight(ListNode.createList(List.of(0,1,2)), 4));
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode node = head;
        int n;
        for (n=1; node.next != null; n++) node = node.next;
        if(k % n == 0) return head;
        node.next = head;
        int headPos = (n- (k % n) - 1);
        ListNode newTail = head;
        for(int i=1; i <= headPos; i++) newTail = newTail.next;
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }


}
