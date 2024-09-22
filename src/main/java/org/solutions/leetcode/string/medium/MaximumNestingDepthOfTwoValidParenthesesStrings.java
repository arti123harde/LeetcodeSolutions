package org.solutions.leetcode.string.medium;

import org.solutions.leetcode.string.easy.PrintUtil;

import java.util.Stack;

/**
 * @author Arti Harde
 */
public class MaximumNestingDepthOfTwoValidParenthesesStrings {

    public static void main(String[] args) {
        PrintUtil.printArray(maxDepthAfterSplit("(()())"));
        PrintUtil.printArray(maxDepthAfterSplit("()(())()"));
    }

    public static int[] maxDepthAfterSplit(String seq) {
        Stack<Character> stack = new Stack<Character>();
        int[] array = new int[seq.length()];
        int i = 0;
        for (char c : seq.toCharArray()) {
            switch (c) {
                case '(' :
                    if (!stack.isEmpty() && stack.peek() == 'A') {
                        array[i] = 1;
                        stack.push('B');
                    }
                    else {
                        array[i] = 0;
                        stack.push('A');
                    }
                    break;
                case ')' :
                    switch (stack.pop()) {
                        case 'A' :
                            array[i] = 0;
                            break;
                        case 'B' :
                            array[i] = 1;
                            break;
                    }
            }
            ++i;
        }
        return array;
    }
}