package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MakeArrayElementsEqualToZero {

    public static void main(String[] args) {
        System.out.println(countValidSelections(new int[]{1,0,2,0,3}));
    }

    public static int countValidSelections(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;
        int preSum = 0, ans = 0;
        for (int n : nums) {
            if (n == 0) {
                int diff = Math.abs(preSum - (total - preSum - n));
                if (diff == 0) ans += 2;
                else if (diff == 1) ans += 1;
            }
            preSum += n;
        }
        return ans;
    }
}
