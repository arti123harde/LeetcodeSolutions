package org.solutions.leetcode.contest;

/**
 * @author Arti Harde
 */
public class MaximumAreaRectangleWithPointConstraintsI {

    public static void main(String[] args) {
//        System.out.println(maxRectangleArea(new int[][]{{1, 1}, {1, 3}, {3, 1}, {3, 3}}));
        System.out.println(maxRectangleArea(new int[][]{{1, 1}, {1, 3}, {3, 1}, {3, 3}, {1, 2}, {3, 2}}));
        System.out.println(maxRectangleArea(new int[][]{{1, 1}, {1, 3}, {3, 1}, {3, 3}, {2, 2}}));
    }

    public static int maxRectangleArea(int[][] points) {
        if(points.length < 4) return -1;
        int maxArea = -1;
        for(int i=0; i<points.length-3; i++){
            for(int j=i+1; j<points.length-2; j++){
                for(int k=j+1; k<points.length-1; k++){
                    for(int l=k+1; l<points.length; l++){
                        if(isValidRectangle(points[i], points[j], points[k], points[l])){
                            boolean isInsidePointExists = false;
                            for (int m=0; m<points.length; m++) {
                                if(m!=i && m!=j && m!=k && m!=l){
                                    if (isPointWithinRectangle(points[j], points[k], points[m])) {
                                        isInsidePointExists = true;
                                        break;
                                    }
                                }
                            }
                            if(!isInsidePointExists){
                                maxArea = Math.max(maxArea, findAreaOfRectangle(points[i], points[j], points[k]));
                            }
                        }
                    }
                }
            }
        }
        return maxArea;
    }

    public static boolean isValidRectangle(int[] p1, int[] p2, int[] p3, int[] p4) {
        int AB = (int) (Math.pow(p2[0]-p1[0], 2) + Math.pow(p2[1]-p1[1], 2));
        int BC = (int)(Math.pow(p2[0]-p3[0], 2) + Math.pow(p2[1]-p3[1], 2));
        int CD = (int)(Math.pow(p3[0]-p4[0], 2) + Math.pow(p3[1]-p4[1], 2));
        int DA = (int)(Math.pow(p4[0]-p1[0], 2) + Math.pow(p4[1]-p1[1], 2));
        int AC = (int)(Math.pow(p3[0]-p1[0], 2) + Math.pow(p3[1]-p1[1], 2));
        int BD = (int)(Math.pow(p2[0]-p4[0], 2) + Math.pow(p2[1]-p4[1], 2));
        return AB == CD && AC == BD && BC == DA;
    }

    public static boolean isPointWithinRectangle(int[] p1, int[] p2, int[] p){
        return p[0] > p2[0] && p[0] < p1[0] && p[1] > p2[1] && p[1] < p1[1];
    }

    public static int findAreaOfRectangle(int[] p1, int[] p2, int[] p3){
        int d1 = (int)Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));
        int d2 = (int)Math.sqrt(Math.pow(p3[0] - p1[0], 2) + Math.pow(p3[1] - p1[1], 2));
        return d1 * d2;
    }

}
