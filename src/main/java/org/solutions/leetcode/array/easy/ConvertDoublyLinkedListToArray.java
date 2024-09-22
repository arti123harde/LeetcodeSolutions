package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.utils.PrintUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class ConvertDoublyLinkedListToArray {

    public static void main(String[] args) {
        PrintUtil.printArray(toArray(createLinkedList(new int[]{1,2,3,4,3,2,1})));
        PrintUtil.printArray(toArray(createLinkedList(new int[]{2,2,2,2,2})));
        PrintUtil.printArray(toArray(createLinkedList(new int[]{3,2,3,2,3,2})));
    }

    public static int[] toArray(Node head) {
        List<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    private static Node createLinkedList(int[] list){
        Node head = new Node(list[0]);
        Node next = head;
        for(int i=1; i<list.length; i++){
            Node newNode = new Node(list[i]);
            next.next = newNode;
            next = newNode;
        }
        return head;
    }

    private static class Node {
        public int val;
        public Node prev;
        public Node next;

        public Node(int val) {
            this.val = val;
        }

    }


}