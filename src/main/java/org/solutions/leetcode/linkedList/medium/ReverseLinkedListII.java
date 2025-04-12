package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;

import java.util.List;

/**
 * @author Arti Harde
 */
public class ReverseLinkedListII {

    public static void main(String[] args) {
        System.out.println(reverseBetween(ListNode.createList(List.of(1,2,3,4,5)), 2 , 5));
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode dummyHead = dummy;
        ListNode prev = null;
        ListNode current = head;
        int count = 1;
        while(current != null){
            if(count < left) {
                dummyHead = current;
                current = current.next;
            }
            if(count >= left && count <= right ){
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            if(count > right) break;
            count++;
        }
        dummyHead.next.next = current;
        dummyHead.next = prev;
        return dummy.next;
    }

}
