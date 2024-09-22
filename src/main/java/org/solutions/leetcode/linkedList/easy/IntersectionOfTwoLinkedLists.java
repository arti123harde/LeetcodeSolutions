package org.solutions.leetcode.linkedList.easy;

import org.solutions.leetcode.linkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(6);
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(8);
        ListNode node7 = new ListNode(4);
        ListNode node8 = new ListNode(5);
        node1.next = node2;
        node3.next = node4;
        node4.next = node5;
        node6.next = node7;
        node7.next = node8;
        node2.next = node6;
        node5.next = node6;
        System.out.println(getIntersectionNode(node1, node3));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //Approach 1
        List<ListNode> l1 = new ArrayList<>();
        while (headA != null){
            l1.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if(l1.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }

        //Approach 2
//        List<ListNode> l1 = new ArrayList<>();
//        List<ListNode> l2 = new ArrayList<>();
//        while (headA != null || headB != null){
//            if(headA != null){
//                l1.add(headA);
//                headA = headA.next;
//            }
//            if(headB != null){
//                l2.add(headB);
//                headB = headB.next;
//            }
//        }
//        for(int i=0; i<Math.min(l1.size(),l2.size()); i++){
//            if(l1.contains(l2.get(i))){
//                return l2.get(i);
//            }else if(l2.contains(l1.get(i))){
//                return l1.get(i);
//            }
//        }
        return null;
    }
}