package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.common.PrintUtil;

public class FloodFill {

    public static void main(String[] args) {
        PrintUtil.printArray(floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2));
        PrintUtil.printArray(floodFill(new int[][]{{0,0,0},{0,0,0}}, 0, 0, 0));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] result = new int[image.length][image[0].length];
        for(int i=0; i<image.length; i++){
            System.arraycopy(image[i], 0, result[i], 0, image[0].length);
        }
        colorPixel(result, image, sr, sc, color, image[sr][sc]);
        return result;
    }

    private static void colorPixel(int[][] result, int[][] image, int i, int j, int color, int originalColor){
        if(image[i][j] == originalColor) {
            result[i][j] = color;
            image[i][j] = -1;
        }
        else {
            result[i][j] = image[i][j];
            return;
        }
        boolean isColored = false;
        //up
        if(i-1 >=0 && image[i-1][j] == originalColor)
            colorPixel(result, image, i-1, j, color, originalColor);
        //down
        if(i+1 <= image.length-1 && image[i+1][j] == originalColor)
            colorPixel(result, image, i+1, j, color, originalColor);
        //left
        if(j-1 >=0 && image[i][j-1] == originalColor)
            colorPixel(result, image, i, j-1, color, originalColor);
        //right
        if(j+1 <= image[0].length-1 && image[i][j+1] == originalColor)
            colorPixel(result, image, i, j+1, color, originalColor);
    }

}
