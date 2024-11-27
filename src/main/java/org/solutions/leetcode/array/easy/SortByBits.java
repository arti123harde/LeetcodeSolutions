package org.solutions.leetcode.array.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Arti Harde
 */
public class SortByBits {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByBits(new int[]{1633,2181,7558,2650,1920,809,4903,2223,4271,4110,7564,5428,1730,5970,9640,3185,7564,5040,4344,9479,2070,6569,9849,73,2961,7991,9419,7946,3293,882,4714,3813,278,6121,9244,8248,5424,2377,4270,7656,1983,2928,2876,4746,129,5971,522,349,1239,9493,4777,1421,1763,8419,5696,726,6130,9164,5290,6793,3670,3090,3395,5597,7557,6246,956,7791,677,2284,7280,5309,8274,1760,2383,7003,4094,1681,8885,3010,1551,7419,813,9937,7054,9615,8126,2739,3255,334,587,634,3382,3316,4630,6077,4687,2226,8910,8357,1961,1454,6416,8838,6295,4523,9736,6165,2849,7877})));
        System.out.println(Arrays.toString(sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})));
        System.out.println(Arrays.toString(sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1})));
    }

    public static int[] sortByBits(int[] arr) {
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Comparator<Integer> comparator = new CustomComparator();
        Arrays.sort(nums, comparator);
        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
    }

    static class CustomComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            if (Integer.bitCount(a) == Integer.bitCount(b)) return a - b;
            return Integer.bitCount(a) - Integer.bitCount(b);
        }
    }
}
