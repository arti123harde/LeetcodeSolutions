package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Arti Harde
 */
public class RemoveNodesFromLinkedList {

    public static void main(String[] args) {
        System.out.println(removeNodes(ListNode.createList(Arrays.asList(1,1,1,1))));
        System.out.println(removeNodes(ListNode.createList(Arrays.asList(5,2,13,3,8))));
    }

    public static ListNode removeNodes(ListNode head) {
        Stack<ListNode> nodeStack = new Stack<>();
        while (head != null){
            nodeStack.push(head);
            head = head.next;
        }
        ListNode prev = nodeStack.pop();
        while (!nodeStack.isEmpty()){
            ListNode node = nodeStack.pop();
            if(node.val >= prev.val){
                node.next = prev;
                prev = node;
            }
        }
        return prev;
    }
}