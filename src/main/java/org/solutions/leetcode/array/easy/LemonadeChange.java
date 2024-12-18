package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Arti Harde
 */
public class LemonadeChange {

    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,5,10,20}));
        System.out.println(lemonadeChange(new int[]{5,5,10,10,20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int bill : bills){
            if(bill == 5) {
                five++;
            }else if(bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            }else{
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }else if(five >= 3) {
                    five -= 3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
