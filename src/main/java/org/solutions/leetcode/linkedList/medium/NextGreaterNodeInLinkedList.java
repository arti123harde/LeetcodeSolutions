package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;
import org.solutions.leetcode.common.PrintUtil;

import java.util.List;

/**
 * @author Arti Harde
 */
public class NextGreaterNodeInLinkedList {

    public static void main(String[] args) {
        ListNode head = ListNode.createList(List.of(2,2,5));
        PrintUtil.printArray(nextLargerNodes(head));
    }

    public static int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode result = new ListNode();
        ListNode n1 = result;
        while(head != null){
            n++;
            int max = head.val;
            ListNode node = head;
            while(node.next != null && node.next.val <= max)  node = node.next;
            ListNode n2 = null;
            if(node.next != null) n2 = new ListNode(node.next.val);
            else n2 = new ListNode(0);
            n1.next = n2;
            n1 = n2;
            head = head.next;
        }
        int k = 0;
        int[] arr = new int[n];
        ListNode h1 = result.next;
        while(h1 != null){
            arr[k++] = h1.val;
            h1 = h1.next;
        }
        return arr;
    }
}
