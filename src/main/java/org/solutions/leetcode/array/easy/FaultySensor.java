package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class FaultySensor {

    public static void main(String[] args) {
        System.out.println(badSensor(new int[]{2,3,2,2,3,2}, new int[]{2,3,2,3,2,7}));
        System.out.println(badSensor(new int[]{2,3,4,5}, new int[]{2,1,3,4}));
        System.out.println(badSensor(new int[]{2,2,2,2,2}, new int[]{2,2,2,2,5}));
    }

    public static int badSensor(int[] sensor1, int[] sensor2) {
        int n = sensor1.length;
        int index = 0;
        while(index < n-1){
            if(sensor1[index] != sensor2[index]){
                if(sensor1[index] == sensor2[index+1] && sensor1[index+1]!=sensor2[index]) return 1;
                else if(sensor1[index] != sensor2[index+1] && sensor1[index+1] ==sensor2[index]) return 2;
            }
            index++;
        }
        return -1;
    }
}
