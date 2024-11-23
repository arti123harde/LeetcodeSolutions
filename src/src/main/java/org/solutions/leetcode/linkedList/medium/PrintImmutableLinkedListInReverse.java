package org.solutions.leetcode.linkedList.medium;

/**
 * @author Arti Harde
 */
public class PrintImmutableLinkedListInReverse {

    public static void main(String[] args) {
        ImmutableListNode listNode1 = new ImmutableListNode(1);
        ImmutableListNode listNode2 = new ImmutableListNode(2);
        ImmutableListNode listNode3 = new ImmutableListNode(3);
        ImmutableListNode listNode4 = new ImmutableListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        printLinkedListInReverse(listNode1);
    }

    public static void printLinkedListInReverse(ImmutableListNode head) {
        if(head == null){
            return;
        }
        printLinkedListInReverse(head.next);
        head.printValue();
    }

    private static class ImmutableListNode{

        private int value;
        private ImmutableListNode next;

        public ImmutableListNode(int value) {
            this.value = value;
        }

        public void printValue(){
            System.out.println(value);
        }

        public ImmutableListNode getNext(){
            return next;
        }
    }

}