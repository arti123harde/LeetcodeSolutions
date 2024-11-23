package org.solutions.leetcode.array.easy;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    /**
     * Boyer-Moore Voting Algorithm
     *
     * If we had some way of counting instances of the majority element as +1
     * and instances of any other element as −1, summing them would make it
     * obvious that the majority element is indeed the majority element.
     *
     */
    public static int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int num : nums){
            if(count == 0){
                element = num;
            }
            count = count + ((num == element) ? 1 : -1);
        }
        return element;
    }
}
