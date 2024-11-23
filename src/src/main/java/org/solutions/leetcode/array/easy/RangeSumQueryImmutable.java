package org.solutions.leetcode.array.easy;

public class RangeSumQueryImmutable {

    int[] array;

    public static void main(String[] args) {
        RangeSumQueryImmutable r = new RangeSumQueryImmutable(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(r.sumRange(0,2));
        System.out.println(r.sumRange(2,5));
        System.out.println(r.sumRange(0,5));
    }

    public RangeSumQueryImmutable(int[] nums) {
//        Solution 1
//        array = nums;

//        Solution 2
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        this.array = nums;
    }

    public int sumRange(int left, int right) {
//        Solution 1
//        int count = 0;
//        for(int i=left; i<=right; i++){
//            count+=array[i];
//        }
//        return count;

//        Solution 2
        if(left == 0) return array[right];
        else return array[right] - array[left-1];
    }
}
