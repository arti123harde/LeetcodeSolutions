package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.linkedList.ListNode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Arti Harde
 */
public class RemoveDuplicatesFromUnsortedLinkedList {

    public static void main(String[] args) {
        System.out.println(deleteDuplicatesUnsorted(ListNode.createList(Arrays.asList(1,2,3,2))));
        System.out.println(deleteDuplicatesUnsorted(ListNode.createList(Arrays.asList(2,1,1,2))));
        System.out.println(deleteDuplicatesUnsorted(ListNode.createList(Arrays.asList(3,2,2,1,3,2,4))));
    }

    public static ListNode deleteDuplicatesUnsorted(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode node = head;
        while (node != null){
            map.put(node.val, map.getOrDefault(node.val, 0) + 1);
            node = node.next;
        }
        ListNode newHead = null;
        ListNode currentNode = null;
        while (head != null){
            if(map.get(head.val) == 1){
                if(newHead == null){
                    newHead = new ListNode(head.val);
                    currentNode = newHead;
                }else{
                    ListNode newNode = new ListNode(head.val);
                    currentNode.next = newNode;
                    currentNode = newNode;
                }
            }
            head = head.next;
        }
        return newHead;
    }
}