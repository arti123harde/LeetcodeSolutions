package org.solutions.leetcode.array.easy;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0,0,1,0,0}, 1));
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                boolean leftspace =  (i == 0) || flowerbed[i-1] == 0;
                boolean rightspace = (i == flowerbed.length-1) || flowerbed[i+1] == 0;
                if(leftspace && rightspace) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
}
