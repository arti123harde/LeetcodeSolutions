package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;

import java.util.List;

import static org.solutions.leetcode.common.ListNode.createList;

/**
 * @author Arti Harde
 */
public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        System.out.println(removeNthFromEnd(createList(List.of(1,2,3,4,5)), 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //Approach 1 - find length of list O(2 * N) = O(N)
//        int noOfNodes = 0;
//        ListNode currentNode = head;
//        while (currentNode != null){
//            currentNode = currentNode.next;
//            noOfNodes++;
//        }
//        if(noOfNodes == n) return head.next;
//        int index = 0;
//        ListNode lastNode = head;
//        while (index < (noOfNodes - n - 1)){
//            lastNode = lastNode.next;
//            index++;
//        }
//        lastNode.next = lastNode.next.next;
//        return head;

        //Approach 2 - Two Pointer Approach . O(N)
        ListNode currentNode = head;
        for(int i=0; i<n; i++) currentNode = currentNode.next;
        if(currentNode == null) return head.next;
        ListNode nextNode = head;
        while (currentNode != null){
            nextNode = nextNode.next;
            currentNode = currentNode.next;
        }
        nextNode.next = nextNode.next.next;
        return head;
    }
}
