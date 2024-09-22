package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.utils.PrintUtil;

/**
 * @author Arti Harde
 */
public class FlippingImage {

    public static void main(String[] args) {
        PrintUtil.printArray(flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}}));
        PrintUtil.printArray(flipAndInvertImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        for(int i=0; i<len; i++){
            for(int j=0, k=image[i].length-1; j<=k; j++,k--){
                int temp = image[i][j];
                image[i][j] = (image[i][k] == 0 ? 1 : 0);
                image[i][k] = (temp == 0 ? 1 : 0);
            }
        }
        return image;
    }
}