package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MaximumHeightOfTriangle {

    public static void main(String[] args) {
        System.out.println(maxHeightOfTriangle(9, 3));
        System.out.println(maxHeightOfTriangle(2, 4));
        System.out.println(maxHeightOfTriangle(2, 1));
        System.out.println(maxHeightOfTriangle(1, 1));
        System.out.println(maxHeightOfTriangle(10, 1));
    }

    public static int maxHeightOfTriangle(int red, int blue) {
        return Math.max(getHeight(red, blue), getHeight(blue, red));
    }

    private static int getHeight(int first, int second){
        int count = 0;
        for(int i=1; i<=(first+second); i++){
            if(i % 2 == 1){
                if(first >= i) first -= i;
                else break;
            }else if(i % 2 == 0){
                if(second >= i) second -= i;
                else break;
            }
            count++;
        }
        return count;
    }

}
