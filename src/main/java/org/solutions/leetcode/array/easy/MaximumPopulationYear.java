package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Arti Harde
 */
public class MaximumPopulationYear {

    public static void main(String[] args) {
        System.out.println(maximumPopulation(new int[][]{{1960,1978},{2014,2034},{1988,2009},{2026,2028},{2001,2025},{2039,2040},{1966,1984},{2038,2041},{2010,2026},{1993,2005},
                {2027,2033},{2038,2046},{2039,2044},{1996,1998},{2017,2021},{1952,1968},{2044,2049},{1981,2016},{2037,2039},{2028,2036},
                {2018,2028},{1957,2022},{2032,2039},{2021,2042},{2002,2020},{1985,2029},{1952,1992},{1982,2001},{1967,1982},{2022,2028},
                {1997,2036},{1960,1989},{2031,2049},{1978,2004},{1950,2050},{1985,2047},{1978,1990},{1959,1971},{1984,2033},{1977,2041},
                {1992,2000},{1984,2047},{1990,2030},{2004,2025},{1974,2027},{1991,2025},{2013,2044},{2037,2047},{2039,2044},{2018,2028},
                {1955,2000},{1992,2015},{2042,2044}}));
        System.out.println(maximumPopulation(new int[][]{{1993, 1999}, {2000, 2010}}));
        System.out.println(maximumPopulation(new int[][]{{1950, 1961}, {1960, 1971}, {1970, 1981}}));
    }

    public static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int[] log : logs){
            arr[log[0] - 1950]++;
            arr[log[1] - 1950]--;
        }
        int max = arr[0];
        int year = 1950;
        for(int i=1; i<101; i++){
            arr[i] += arr[i-1];
            if(arr[i] > max) {
                max = arr[i];
                year = 1950 + i;
            }
        }
        return year;
    }
}
