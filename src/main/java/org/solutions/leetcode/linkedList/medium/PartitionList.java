package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;

import java.util.List;

/**
 * @author Arti Harde
 */
public class PartitionList {

    public static void main(String[] args) {
        System.out.println(partition(ListNode.createList(List.of(1,4,3,2,5,2)), 3));
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        ListNode beforeHead = before;
        ListNode afterHead = after;
        while (head != null){
            if(head.val < x){
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = afterHead.next;
        return beforeHead.next;
    }
}
