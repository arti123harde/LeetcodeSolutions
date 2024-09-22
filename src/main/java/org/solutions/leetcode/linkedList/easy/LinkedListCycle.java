package org.solutions.leetcode.linkedList.easy;

import org.solutions.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        System.out.println(hasCycle(node1));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode node = head;
        List<ListNode> list = new ArrayList<>();
        while (node != null){
            list.add(node);
            if(list.contains(node.next)){
                return true;
            }else {
                node = node.next;
            }
        }
        return false;
    }
}