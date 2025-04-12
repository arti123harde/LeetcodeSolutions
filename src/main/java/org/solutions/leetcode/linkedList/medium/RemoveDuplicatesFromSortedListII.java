package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class RemoveDuplicatesFromSortedListII {

    public static void main(String[] args) {
        System.out.println(deleteDuplicates(ListNode.createList(List.of(1,2,3,3,4,4,5))));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        while (head != null){
            if(head.next != null && head.val == head.next.val){
                while (head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            }else prev = prev.next;
            head = head.next;
        }
        return temp.next;
    }
}
