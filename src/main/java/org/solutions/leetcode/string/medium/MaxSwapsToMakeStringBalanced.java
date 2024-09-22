package org.solutions.leetcode.string.medium;

import java.util.Stack;

/**
 * @author Arti Harde
 */
public class MaxSwapsToMakeStringBalanced {

    public static void main(String[] args) {
        System.out.println(minSwaps("]]][[["));
        System.out.println(minSwaps("][]["));
        System.out.println(minSwaps("[]"));
    }

    public static int minSwaps(String s) {
        int count = 0;
        int result;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    count++;
                }else {
                    stack.pop();
                }
            }
        }
        result = count/2;
        if(count % 2 != 0){
            result++;
        }
        return result;
    }

    public static int minSwaps2(String s) {
        int count = 0;
        while (true){
            Stack<Integer> stack = new Stack<>();
            int index = -1;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == ']' && stack.isEmpty() && index == -1){
                    index = i;
                }else if(s.charAt(i) == ']' && !stack.isEmpty()){
                    stack.pop();
                }else {
                    stack.push(i);
                }
            }
            if(index != -1){
                count++;
                int j = stack.pop();
                char[] chars = s.toCharArray();
                char c = chars[index];
                chars[index] = chars[j];
                chars[j] = c;
                s = new String(chars);
            }else{
                break;
            }
        }
        return count;
    }

    public static int minSwaps1(String s) {
        int count = 0;
        while (!validateParentheses(s)){
            Stack<Integer> stack = new Stack<>();
            int index = -1;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == ']' && stack.isEmpty() && index == -1){
                    index = i;
                }else if(s.charAt(i) == ']' && !stack.isEmpty()){
                    stack.pop();
                }else {
                    stack.push(i);
                }
            }
            if(index != -1){
                count++;
                int j = stack.pop();
                char[] chars = s.toCharArray();
                char c = chars[index];
                chars[index] = chars[j];
                chars[j] = c;
                s = new String(chars);
            }
        }
        return count;
    }

    private static boolean validateParentheses(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '['){
                stack.push(']');
            }else if(stack.empty() || stack.pop() != c){
                return false;
            }
        }
        return stack.empty();
    }
}