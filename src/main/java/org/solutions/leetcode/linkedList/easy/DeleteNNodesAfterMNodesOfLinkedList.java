package org.solutions.leetcode.linkedList.easy;

import org.solutions.leetcode.linkedList.ListNode;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class DeleteNNodesAfterMNodesOfLinkedList {

    public static void main(String[] args) {
        System.out.println(deleteNodes(ListNode.createList(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11)), 3, 1));
        System.out.println(deleteNodes(ListNode.createList(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13)), 2, 3));
        System.out.println(deleteNodes(ListNode.createList(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11)), 1, 3));

    }

    public static ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode node  = head;
        ListNode dNode = null;
        boolean mTraverse = true;
        boolean nTraverse = false;
        int countM = 1;
        int countN = 1;
        while (node != null){
            if(mTraverse){
                if(countM < m){
                    node = node.next;
                    countM++;
                }else{
                    mTraverse = false;
                    nTraverse = true;
                    dNode = node.next;
                    countM = 1;
                }
            }
            if(nTraverse){
                if(dNode!= null && countN < n){
                    dNode = dNode.next;
                    countN++;
                }else{
                    if(dNode != null){
                        node.next = dNode.next;
                        node = node.next;
                    }else{
                        node.next = null;
                        break;
                    }
                    dNode = null;
                    mTraverse = true;
                    nTraverse = false;
                    countN = 1;
                }
            }
        }
        return head;
    }

}