package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;
import org.solutions.leetcode.common.TreeNode;

import java.util.List;

import static org.solutions.leetcode.common.TreeNode.inOrderTraversal;

/**
 * @author Arti Harde
 */
public class ConvertSortedListToBinarySearchTree {

    public static void main(String[] args) {
        inOrderTraversal(sortedListToBST(ListNode.createList(List.of(-10,-3,0,5,9))));
    }

    public static TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        ListNode midListNode = findMiddleNode(head);
        TreeNode treeNode = new TreeNode(midListNode.val);
        if(head == midListNode) return treeNode;
        treeNode.left = sortedListToBST(head);
        treeNode.right = sortedListToBST(midListNode.next);
        return treeNode;
    }

    private static ListNode findMiddleNode(ListNode head){
        ListNode prevPtr = null;
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null){
            prevPtr = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        if(prevPtr != null) prevPtr.next = null;
        return slowPointer;
    }
}
