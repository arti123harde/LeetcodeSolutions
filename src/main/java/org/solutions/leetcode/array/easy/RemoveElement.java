package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class RemoveElement {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 2));
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        int currentIndex = 0;
        int len = nums.length;
        while(index < len){
            if(nums[index] != val){
                nums[currentIndex] = nums[index];
                currentIndex++;
            }
            index++;
        }
        for (int i=currentIndex; i<len; i++){
            nums[i] = -1;
        }
        return currentIndex;
    }
}