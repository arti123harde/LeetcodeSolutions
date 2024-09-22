package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = -1;
        int mid = (nums.length-1)/2;
        if(nums[mid] == target){
            index =  mid;
        }else if(nums[0] > target){
            index = 0;
        }else if(nums[nums.length-1] < target){
            index = nums.length;
        }else if(nums[mid] < target){
            for(int i=mid; i<nums.length; i++){
                if(nums[i] == target){
                    index = i;
                    break;
                }else if(nums[i] < target && nums[i+1] > target){
                    index = i+1;
                    break;
                }
            }
        }else if(nums[mid] > target){
            for(int i=0; i<mid; i++){
                if(nums[i] == target){
                    index = i;
                    break;
                }else if(nums[i] < target && nums[i+1] > target){
                    index = i+1;
                    break;
                }
            }
        }
        return index;
    }
}