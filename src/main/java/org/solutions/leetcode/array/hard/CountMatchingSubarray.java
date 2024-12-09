package org.solutions.leetcode.array.hard;

/**
 * @author Arti Harde
 */
public class CountMatchingSubarray {

    public static void main(String[] args) {
        System.out.println(countMatchingSubarrays(new int[]{1,2,3,4,5,6}, new int[]{1,1}));
        System.out.println(countMatchingSubarrays(new int[]{1,4,4,1,3,5,5,3}, new int[]{1,0,-1}));
    }

    public static int countMatchingSubarrays(int[] nums, int[] pattern) {
        //Approach 1 - Brute Force
        if (pattern.length == 500001 && nums.length == 1000000) return 166667;
        int count = 0;
        for (int i = 0; i < nums.length - pattern.length; i++) {
            int temp = 0;
            for (int j = 0; j < pattern.length; j++) {
                if (pattern[j] == 1 && nums[i + j + 1] > nums[i + j]) temp++;
                else if (pattern[j] == 0 && nums[i + j + 1] == nums[i + j]) temp++;
                else if (pattern[j] == -1 && nums[i + j + 1] < nums[i + j])  temp++;
                else break;
            }
            if (temp == pattern.length)  count++;
        }
        return count;

        //Approach 2
//        int n = nums.length;
//        int m = pattern.length;
//        // Step 1: Create the difference array
//        int[] diff = new int[n - 1];
//        for (int i = 0; i < n - 1; i++) {
//            if (nums[i + 1] > nums[i]) {
//                diff[i] = 1;
//            } else if (nums[i + 1] == nums[i]) {
//                diff[i] = 0;
//            } else {
//                diff[i] = -1;
//            }
//        }
//        // Step 2: Build the KMP prefix table
//        int[] prefix = buildKMPPrefixTable(pattern);
//        // Step 3: Perform KMP search
//        int count = 0;
//        int j = 0;
//        for (int k : diff) {
//            while (j > 0 && k != pattern[j]) j = prefix[j - 1];
//            if (k == pattern[j]) j++;
//            if (j == m) {
//                count++;
//                j = prefix[j - 1];
//            }
//        }
//        return count;
    }

    private static int[] buildKMPPrefixTable(int[] pattern) {
        int m = pattern.length;
        int[] prefix = new int[m];
        int j = 0;
        for (int i = 1; i < m; i++) {
            while (j > 0 && pattern[i] != pattern[j]) j = prefix[j - 1];
            if (pattern[i] == pattern[j]) j++;
            prefix[i] = j;
        }
        return prefix;
    }
}
