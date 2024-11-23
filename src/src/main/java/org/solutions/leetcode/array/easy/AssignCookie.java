package org.solutions.leetcode.array.easy;

import java.util.Arrays;

public class AssignCookie {

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
        System.out.println(findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while (i<g.length && j<s.length){
            if(s[j] >= g[i]){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i;
    }
}
