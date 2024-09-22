package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;

/**
 * @author Arti Harde
 */
public class DeleteNodeInLinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        deleteNode(node2);
        System.out.println(node1);
    }

    /**
     * Condition : We don't have access to head of the LinkedList
     * We have just provided node to be deleted
     *  Approach : start copying data from next node to current node and delete last node
     */

    public static void deleteNode(ListNode node) {
        ListNode prev = node;
        while (node.next != null){
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }
}