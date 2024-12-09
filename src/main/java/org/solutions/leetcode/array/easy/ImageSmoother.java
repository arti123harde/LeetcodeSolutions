package org.solutions.leetcode.array.easy;

import org.solutions.leetcode.common.PrintUtil;

public class ImageSmoother {

    public static void main(String[] args) {
        PrintUtil.printArray(imageSmoother(new int[][]{{100, 200, 100}, {200, 50, 200}, {100, 200, 100}}));
    }

    public static int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        for(int i=0; i<img.length; i++){
            for(int j=0; j<img[0].length; j++){
                int sum = 0;
                int count = 0;
                //node
                sum += img[i][j];
                count++;
                //left
                if(j-1 >= 0) {
                    sum += img[i][j - 1];
                    count++;
                }
                //right
                if(j+1 < img[0].length) {
                    sum += img[i][j + 1];
                    count++;
                }
                //up
                if(i-1 >= 0) {
                    sum += img[i - 1][j];
                    count++;
                }
                //up left
                if(i-1 >= 0 && j-1 >= 0) {
                    sum += img[i - 1][j - 1];
                    count++;
                }
                //up right
                if(i-1 >= 0 && j+1 < img[0].length) {
                    sum += img[i - 1][j + 1];
                    count++;
                }
                //down
                if(i+1 < img.length) {
                    sum += img[i + 1][j];
                    count++;
                }
                //down left
                if(i+1 < img.length && j-1 >= 0) {
                    sum += img[i + 1][j - 1];
                    count++;
                }
                //down right
                if(i+1 < img.length && j+1 < img[0].length) {
                    sum += img[i + 1][j + 1];
                    count++;
                }
                result[i][j] = sum/count;
            }
        }
        return result;
    }
}
