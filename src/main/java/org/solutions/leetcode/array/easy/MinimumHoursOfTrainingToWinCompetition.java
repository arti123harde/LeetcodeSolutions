package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MinimumHoursOfTrainingToWinCompetition {

    public static void main(String[] args) {
        System.out.println(minNumberOfHours(5, 3, new int[]{1,4,3,2}, new int[]{2,6,3,1}));
    }

    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int hours = 0;
        int diff = 0;
        int N = energy.length;
        for(int i = 0; i<N; i++){
            if (energy[i] >= initialEnergy) {
                diff = energy[i] - initialEnergy + 1;
                hours = hours + diff;
                initialEnergy = initialEnergy + diff;
            }
            initialEnergy = initialEnergy - energy[i];
            if (experience[i] >= initialExperience) {
                diff = experience[i] - initialExperience + 1;
                hours = hours + diff;
                initialExperience = initialExperience + diff;
            }
            initialExperience = initialExperience + experience[i];
        }
        return hours;
    }

}