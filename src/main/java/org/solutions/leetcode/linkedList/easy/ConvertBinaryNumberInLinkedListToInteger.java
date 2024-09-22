package org.solutions.leetcode.linkedList.easy;

import org.solutions.leetcode.linkedList.ListNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class ConvertBinaryNumberInLinkedListToInteger {

    public static void main(String[] args) {
        System.out.println(getDecimalValue(ListNode.createList(Arrays.asList(1,0,1))));
        System.out.println(getDecimalValue(ListNode.createList(List.of(0))));
        System.out.println(getDecimalValue(ListNode.createList(List.of(1,1,1))));
        System.out.println(getDecimalValue(ListNode.createList(List.of(1,0,0,0))));
    }

    public static int getDecimalValue(ListNode head) {
        StringBuilder s = new StringBuilder();
        while (head != null){
            s.append(head.val);
            head = head.next;
        }
        int value = 0;
        String num = s.toString();
        int len = num.length()-1;
        for(int i=0; i<num.length(); i++){
            value += (int) (Integer.parseInt(String.valueOf(num.charAt(i))) * Math.pow(2, len));
            len--;
        }
        return value;
    }
}