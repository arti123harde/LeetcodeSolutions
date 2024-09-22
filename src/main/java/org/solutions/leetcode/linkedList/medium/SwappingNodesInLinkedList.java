package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.linkedList.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class SwappingNodesInLinkedList {

    public static void main(String[] args) {
        System.out.println(swapNodes(ListNode.createList(Arrays.asList(1,2,3,4,5)), 2));
        System.out.println(swapNodes(ListNode.createList(Arrays.asList(7,9,6,6,7,8,3,0,9,5)), 5));
    }

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode node = head;
        ArrayList<ListNode> listNodes = new ArrayList<>();
        while (node != null){
            listNodes.add(node);
            node  = node.next;
        }
        int temp = listNodes.get(k-1).val;
        listNodes.get(k-1).val = listNodes.get(listNodes.size()-k).val;
        listNodes.get(listNodes.size()-k).val = temp;
        return head;
    }
}