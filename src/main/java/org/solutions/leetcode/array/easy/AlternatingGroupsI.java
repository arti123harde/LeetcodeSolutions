package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class AlternatingGroupsI {

    public static void main(String[] args) {
        System.out.println(numberOfAlternatingGroups(new int[]{1,0,1,0}));
        System.out.println(numberOfAlternatingGroups(new int[]{1,0,1}));
        System.out.println(numberOfAlternatingGroups(new int[]{1,1,1}));
        System.out.println(numberOfAlternatingGroups(new int[]{0,1,0,0,1}));
    }

    public static int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        if(colors[0] == colors[colors.length-2] && colors[0] != colors[colors.length-1]) count++;
        if(colors[1] == colors[colors.length-1] && colors[0] != colors[1]) count++;
        for(int i=1; i<colors.length-1; i++) if(colors[i-1] == colors[i+1] && colors[i] != colors[i-1]) count++;
        return count;
    }
}
