package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class GroupsOfSpecialEquivalentStrings {

    public static void main(String[] args) {
        System.out.println(numSpecialEquivGroups(new String[]{"abcd","cdab","cbad","xyzz","zzxy","zzyx"}));
        System.out.println(numSpecialEquivGroups(new String[]{"abc","acb","bac","bca","cab","cba"}));
    }

    public static int numSpecialEquivGroups(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            List<Character> even = new ArrayList<>();
            List<Character> odd = new ArrayList<>();
            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0) {
                    even.add(word.charAt(j));
                } else {
                    odd.add(word.charAt(j));
                }
            }
            Collections.sort(even);
            Collections.sort(odd);
            set.add(Arrays.toString(even.toArray(new Character[0])) + Arrays.toString(odd.toArray(new Character[0])));
        }
        return set.size();
    }
}