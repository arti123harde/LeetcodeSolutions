package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class CountTestedDevicesAfterTestOperations {

    public static void main(String[] args) {
        System.out.println(countTestedDevices(new int[]{1,1,2,1,3}));
    }

    public static int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for (int batteryPercentage : batteryPercentages) if (batteryPercentage - count > 0) count++;
        return count;
    }
}
