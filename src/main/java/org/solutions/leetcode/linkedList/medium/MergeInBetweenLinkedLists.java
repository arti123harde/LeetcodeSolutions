package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.linkedList.ListNode;

import java.util.Arrays;

import static org.solutions.leetcode.linkedList.ListNode.createList;


/**
 * @author Arti Harde
 */
public class MergeInBetweenLinkedLists {

    public static void main(String[] args) {
        System.out.println(mergeInBetween(createList(Arrays.asList(10,1,13,6,9,5)), 3,4,
                createList(Arrays.asList(1000000,1000001,1000002))));
        System.out.println(mergeInBetween(createList(Arrays.asList(0,1,2,3,4,5,6)), 2,5,
                createList(Arrays.asList(1000000,1000001,1000002,1000003,1000004))));
    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count = 0;
        ListNode first = null;
        ListNode last = null;
        ListNode head = list1;
        while (list1 != null && (first == null || last == null)){
            if(count == a-1){
                first = list1;
            }
            if(count == b){
                last = list1.next;
            }
            list1 = list1.next;
            count++;
        }
        first.next = list2;
        while (list2.next != null){
            list2 = list2.next;
        }
        list2.next = last;
        return head;
    }
}