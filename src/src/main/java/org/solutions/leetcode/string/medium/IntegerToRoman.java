package org.solutions.leetcode.string.medium;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }

    /**
        Symbol	    Value
        I	        1
        V	        5
        X	        10
        L	        50
        C	        100
        D	        500
        M	        1000
     */
    public static String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        while (num != 0){
            int maxNum = 0;
            for(int i : map.keySet()){
                if(num >= i){
                    maxNum = Math.max(maxNum, i);
                }
            }
            stringBuilder.append(map.get(maxNum));
            num = num - maxNum;
        }
        return stringBuilder.toString();
    }
}
