package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FindKOROfArray {

    public static void main(String[] args) {
        System.out.println(findKOr(new int[]{7,12,9,8,9,15}, 4));
        System.out.println(findKOr(new int[]{2,12,1,11,4,5}, 6));
        System.out.println(findKOr(new int[]{10,8,5,9,11,6,8}, 1));
    }

    public static int findKOr(int[] nums, int k) {
        //Approach 1
//        int[][] bits = new int[nums.length][31];
//        int maxLen = 0;
//        for(int i=0; i<nums.length; i++){
//            char[] chars = Integer.toBinaryString(nums[i]).toCharArray();
//            maxLen = Math.max(maxLen, chars.length);
//            for(int j=0; j<chars.length; j++) bits[i][31 - chars.length + j] = chars[j] - 48;
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        for(int i=30; i>=31-maxLen; i--){
//            int ones = 0;
//            for(int j=0; j<nums.length; j++) if(bits[j][i] == 1) ones++;
//            if(ones >= k) stringBuilder.insert(0, 1);
//            else stringBuilder.insert(0, 0);
//        }
//        return Integer.parseInt(stringBuilder.toString(), 2);


        //Approach 2
        int[] cnt = new int[32];
        int res = 0;
        for(int n : nums) for(int i = 0;i < 32;i++) cnt[i] += ((n >> i) & 1);
        for(int i = 0;i < 32;i++) if(cnt[i] >= k) res |= (1 << i);
        return res;
    }
}