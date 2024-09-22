package org.solutions.leetcode.linkedList.easy;

import org.solutions.leetcode.common.ListNode;

import java.util.Arrays;

import static org.solutions.leetcode.common.ListNode.createList;

/**
 * @author Arti Harde
 */
public class WinnerOfLinkedListGame {

    public static void main(String[] args) {
        System.out.println(gameResult(createList(Arrays.asList(2,1))));
        System.out.println(gameResult(createList(Arrays.asList(2,5,4,7,20,5))));
    }

    public static String gameResult(ListNode head) {
        int even = 0;
        int odd = 0;
        ListNode node =  head;
        while (node != null){
            if(node.val > node.next.val){
                even++;
            }else{
                odd++;
            }
            node = node.next.next;
        }
        if(even > odd){
            return "Even";
        }else if(even < odd){
            return "Odd";
        }else{
            return "Tie";
        }
    }
}