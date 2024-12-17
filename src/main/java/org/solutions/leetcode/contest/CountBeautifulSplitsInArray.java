package org.solutions.leetcode.contest;

/**
 * @author Arti Harde
 */
public class CountBeautifulSplitsInArray {

    public static void main(String[] args) {
        System.out.println(beautifulSplits(new int[]{}));
    }

    public static int beautifulSplits(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrefix(nums, 0, i, i, j) || isPrefix(nums, i, j, j, n))  count++;
            }
        }
        return count;
    }

    private static boolean isPrefix(int[] nums, int a, int b, int c, int d) {
        int length1 = b - a;
        int length2 = d - c;
        if (length1 > length2) return false;
        for (int i = 0; i < length1; i++) if (nums[a + i] != nums[c + i]) return false;
        return true;
    }

}
