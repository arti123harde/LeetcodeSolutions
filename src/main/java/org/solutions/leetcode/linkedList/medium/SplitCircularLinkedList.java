package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.linkedList.ListNode;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class SplitCircularLinkedList {

    public static void main(String[] args) {
        ListNode[] result1 = splitCircularLinkedList(ListNode.createList(Arrays.asList(1,5,7)));
        ListNode[] result2 = splitCircularLinkedList(ListNode.createList(Arrays.asList(2,6,1,5)));
    }

    public static ListNode[] splitCircularLinkedList(ListNode list) {
        int count = 1;
        ListNode last = list;
        while (last.next != null){
            count++;
            last = last.next;
        }
        int mid = (int) Math.ceil(count / 2.0);
        ListNode firstHalf = list;
        while (mid > 1){
            firstHalf = firstHalf.next;
            mid--;
        }
        ListNode secondHalf = firstHalf.next;
        last.next = secondHalf;
        firstHalf.next = list;
        return new ListNode[]{list, secondHalf};
    }
}