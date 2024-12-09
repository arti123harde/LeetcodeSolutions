package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Arti Harde
 */
public class FindingThreeDigitEvenNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{2, 1, 3, 0})));
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{2,2,8,8,2})));
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{3,7,5})));
    }

    public static int[] findEvenNumbers(int[] digits) {
        Map<Integer, Integer> firstPlace = new HashMap<>();
        Map<Integer, Integer> secondPlace = new HashMap<>();
        Map<Integer, Integer> thirdPlace = new HashMap<>();
        for(int i=0 ; i<digits.length; i++){
            if(digits[i] != 0) firstPlace.put(i, digits[i]);
            if(digits[i] % 2 == 0) thirdPlace.put(i, digits[i]);
            secondPlace.put(i, digits[i]);
        }
        Set<Integer> set = new TreeSet<>();
        for(int fk : firstPlace.keySet()){
            for(int sk : secondPlace.keySet()){
                for(int tk : thirdPlace.keySet()){
                    if(fk != sk && sk != tk && fk != tk)
                        set.add(firstPlace.get(fk) * 100 + secondPlace.get(sk) * 10 + thirdPlace.get(tk));
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
