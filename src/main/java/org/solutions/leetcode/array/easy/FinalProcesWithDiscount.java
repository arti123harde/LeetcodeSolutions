package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class FinalProcesWithDiscount {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[]{8,7,4,2,8,1,7,7,10,1})));
        System.out.println(Arrays.toString(finalPrices(new int[]{8, 4, 6, 2, 3})));
        System.out.println(Arrays.toString(finalPrices(new int[]{1,2,3,4,5})));
    }

    public static int[] finalPrices(int[] prices) {
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
