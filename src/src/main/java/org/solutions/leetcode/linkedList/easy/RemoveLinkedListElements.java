package org.solutions.leetcode.linkedList.easy;

import org.solutions.leetcode.common.ListNode;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class RemoveLinkedListElements {

    public static void main(String[] args) {
        System.out.println(removeElements(ListNode.createList(Arrays.asList(1,2,6,3,4,5,6)), 6));
        System.out.println(removeElements(ListNode.createList(Arrays.asList(7,7,7,7)), 7));
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode node = null;
        while (head != null){
            if(head.val != val){
                if(prev == null){
                    node = new ListNode(head.val);
                    prev = node;
                }else{
                    prev.next = new ListNode(head.val);;
                    prev = prev.next;
                }
            }
            head = head.next;
        }
        return node;
    }

}