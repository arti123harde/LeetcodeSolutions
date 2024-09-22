package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.linkedList.ListNode;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class MergeNodesInBetweenZeros {

    public static void main(String[] args) {
        System.out.println(mergeNodes(ListNode.createList(Arrays.asList(0,3,1,0,4,5,2,0))));
        System.out.println(mergeNodes(ListNode.createList(Arrays.asList(0,1,0,3,0,2,2,0))));
    }

    public static ListNode mergeNodes(ListNode head) {
        ListNode node = head.next;
        ListNode newNode = null;
        ListNode newList = null;
        int count = 0;
        while (node != null){
            if(node.val == 0){
                if(newList == null){
                    newNode = new ListNode(count);
                    newList = newNode;
                }else{
                    newList.next = new ListNode(count);
                    newList = newList.next;
                }
                count = 0;
            }else{
                count  = count + node.val;
            }
            node = node.next;
        }
        return newNode;
    }
}