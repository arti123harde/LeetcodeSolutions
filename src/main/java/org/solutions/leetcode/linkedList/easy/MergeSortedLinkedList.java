package org.solutions.leetcode.linkedList.easy;

import org.solutions.leetcode.common.ListNode;

import java.util.Arrays;
import java.util.List;

import static org.solutions.leetcode.common.ListNode.createList;

/**
 * @author Arti Harde
 */
public class MergeSortedLinkedList {

    public static void main(String[] args) {
        System.out.println(mergeTwoLists(createList(Arrays.asList(1,2,4)), createList(Arrays.asList(1,3,4))));
        System.out.println(mergeTwoLists(createList(List.of()), createList(List.of())));
        System.out.println(mergeTwoLists(createList(List.of()), createList(List.of(0))));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 != null && list2 != null){
            ListNode head = null;
            ListNode node = null;
            while(list1 != null && list2 != null){
                if(list1.val > list2.val){
                    ListNode newNode = new ListNode(list2.val);
                    if(head == null){
                        head = newNode;
                        node = head;
                    }else {
                        node.next = newNode;
                        node = newNode;
                    }
                    list2 = list2.next;
                }else if(list1.val < list2.val){
                    ListNode newNode = new ListNode(list1.val);
                    if(head == null){
                        head = newNode;
                        node = head;
                    }else {
                        node.next = newNode;
                        node = newNode;
                    }
                    list1 = list1.next;
                }else{
                    ListNode newNode1 = new ListNode(list1.val);
                    ListNode newNode2 = new ListNode(list2.val);
                    if(head == null){
                        head = newNode1;
                        node = head;
                    }else {
                        node.next = newNode1;
                        node = newNode1;
                    }
                    node.next = newNode2;
                    node = newNode2;
                    list1 = list1.next;
                    list2 = list2.next;
                }
            }
            if(list1 != null){
                node.next = list1;
            }else if(list2 != null){
                node.next = list2;
            }
            return head;
        }else if(list1 != null){
            return list1;
        }else {
            return list2;
        }
    }

}