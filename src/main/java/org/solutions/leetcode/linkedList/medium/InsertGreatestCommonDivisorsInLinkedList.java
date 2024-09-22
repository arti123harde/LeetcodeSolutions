package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.linkedList.ListNode;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class InsertGreatestCommonDivisorsInLinkedList {

    public static void main(String[] args) {
        System.out.println(insertGreatestCommonDivisors(ListNode.createList(Arrays.asList(18,6,10,3))));
        System.out.println(insertGreatestCommonDivisors(ListNode.createList(Arrays.asList(7))));
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode node = head;
        while (node.next != null){
            ListNode next = node.next;
            ListNode gcdNode = new ListNode(gcd(node.val, node.next.val));
            node.next = gcdNode;
            gcdNode.next = next;
            node = next;
        }
        return head;
    }

    public static int getGcd(int a, int b){
        if(b!=0)
            return getGcd(b,a%b);
        else
            return a;
    }

    private static int gcd(int a,  int b){
        int gcd = 1;
        for(int i=2; i<=Math.min(a,b); i++){
            if((a % i == 0) && (b % i == 0)){
                gcd = Math.max(gcd, i);
            }
        }
        return gcd;
    }
}