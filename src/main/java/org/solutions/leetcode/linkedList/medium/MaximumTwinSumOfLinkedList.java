package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.linkedList.ListNode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Arti Harde
 */
public class MaximumTwinSumOfLinkedList {

    public static void main(String[] args) {
        System.out.println(pairSum(ListNode.createList(Arrays.asList(5,4,2,1))));
        System.out.println(pairSum(ListNode.createList(Arrays.asList(4,2,2,3))));
        System.out.println(pairSum(ListNode.createList(Arrays.asList(1,100000))));
    }

    public static int pairSum(ListNode head) {
        int maxSum = Integer.MIN_VALUE;
        Stack<ListNode> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            stack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }
        while (!stack.isEmpty() && slow != null){
            maxSum = Math.max(maxSum, slow.val + stack.pop().val);
            slow = slow.next;
        }
        return maxSum;
    }
}