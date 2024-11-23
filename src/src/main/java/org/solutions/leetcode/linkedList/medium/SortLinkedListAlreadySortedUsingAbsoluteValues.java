package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class SortLinkedListAlreadySortedUsingAbsoluteValues {

    public static void main(String[] args) {
        System.out.println(sortLinkedList(ListNode.createList(Arrays.asList(0,2,-5,5,10,-10))));
        System.out.println(sortLinkedList(ListNode.createList(Arrays.asList(0,1,2))));
        System.out.println(sortLinkedList(ListNode.createList(List.of(1))));
    }

    public static ListNode sortLinkedList(ListNode head) {
        //Since list is already sorted using absolute values, whenever any negative value comes,
        // move it to head
        ListNode node = head.next;
        ListNode prev = head;
        ListNode currentHead = head;
        while (node != null){
            if(node.val < 0){
                prev.next = node.next;
                node.next = currentHead;
                currentHead = node;
                node = prev.next;
            }else{
                prev = node;
                node = node.next;
            }
        }
        return currentHead;
    }
}