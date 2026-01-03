package org.solutions.leetcode.linkedList.medium;

import org.solutions.leetcode.common.ListNode;
import org.solutions.leetcode.common.PrintUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class NodesBetweenCriticalPoints {

    public static void main(String[] args) {
        ListNode head = ListNode.createList(List.of(5,3,1,2,5,1,2));
        PrintUtil.printArray(nodesBetweenCriticalPoints(head));
    }

    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return new int[]{-1, -1};
        }
        int prev = head.val;
        ListNode node = head.next;
        int count = 2;
        List<Integer> list = new ArrayList<>();
        while(node.next != null){
            if(prev > node.val && node.next.val > node.val) {
                list.add(count);
            }
            if(prev < node.val && node.next.val < node.val) {
                list.add(count);
            }
            count++;
            prev = node.val;
            node = node.next;
        }
        if(list.isEmpty()) return new int[]{-1, -1};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                min = Math.min(min, Math.abs(list.get(i) - list.get(j)));
                max = Math.max(max, Math.abs(list.get(i) - list.get(j)));
            }
        }
        return new int[]{min, max};
    }
}
