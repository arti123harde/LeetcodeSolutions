package org.solutions.leetcode.array.medium;

import java.util.PriorityQueue;

/**
 * @author Arti Harde
 */
public class MaximumAveragePassRatio {

    public static void main(String[] args) {

    }

    public static double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> queue = new PriorityQueue<>((a, b) -> Double.compare(b[2], a[2]));
        double result = 0d;
        for (int[] singleClass : classes) {
            result += ((double)singleClass[0] / singleClass[1]);
            queue.add(new double[] {singleClass[0], singleClass[1], calculateGain(singleClass[0], singleClass[1])});
        }
        while (extraStudents > 0) {
            extraStudents--;
            double[] current = queue.poll();
            result += current[2];
            current[0]++;
            current[1]++;
            current[2] = calculateGain(current[0], current[1]);
            queue.add(current);
        }
        return result / classes.length;
    }

    private static double calculateGain(double passes, double totalStudents) {
        return ((passes + 1d) / (totalStudents + 1d)) - (passes / totalStudents);
    }
}
