package org.solutions.leetcode.array.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class MaximumNumberOfIntegersToChooseFromARangeI {

    public static void main(String[] args) {
        System.out.println(maxCount(new int[]{11}, 7, 50));
        System.out.println(maxCount(new int[]{1,6,5}, 5, 6));
        System.out.println(maxCount(new int[]{1,2,3,4,5,6,7}, 8, 1));
    }

    public static int maxCount(int[] banned, int n, int maxSum) {
        if(maxSum == 1) return 0;
        else {
            Set<Integer> set = new HashSet<>();
            for(int num : banned) set.add(num);
            int sum = 0;
            int count = 0;
            for(int i=1; i<=n; i++){
                if(!set.contains(i)){
                    if(sum + i <= maxSum){
                        sum += i;
                        count++;
                    }else break;
                }
            }
            return count;
        }
    }
}
