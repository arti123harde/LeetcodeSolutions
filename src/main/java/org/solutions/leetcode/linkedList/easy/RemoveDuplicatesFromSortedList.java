package org.solutions.leetcode.linkedList.easy;

import org.solutions.leetcode.linkedList.ListNode;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        System.out.println(deleteDuplicates(ListNode.createList(Arrays.asList(1,1,2,3,3))));
        System.out.println(deleteDuplicates(ListNode.createList(Arrays.asList(1,1,2))));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null || node.next != null){
            if(node.val == node.next.val){
                ListNode next = node.next.next;
                node.next.next = null;
                node.next = next;
            }else{
                node = node.next;
            }
        }
        return head;
    }
}