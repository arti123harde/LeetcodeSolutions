package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToSellAndBuyStocks {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        //Brute Force Approach
//        for(int i=0; i<prices.length; i++){
//            for(int j=i+1; j<prices.length; j++){
//                if(prices[j] > prices[i] && maxProfit<(prices[j] - prices[i]))
//                    maxProfit = prices[j] - prices[i];
//            }
//        }

        //Single Pass approach
        int minprice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minprice) minprice = price;
            else if (price - minprice > maxProfit) maxProfit = price - minprice;
        }
        return maxProfit;
    }
}