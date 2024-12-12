package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Arti Harde
 */
public class BuyTwoChocolates {

    public static void main(String[] args) {
        System.out.println(buyChoco(new int[]{1,2,2}, 3));
        System.out.println(buyChoco(new int[]{3,2,3}, 3));
    }

    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(prices[0] + prices[1] > money) return money;
        else return money - (prices[0] + prices[1]);
    }
}
