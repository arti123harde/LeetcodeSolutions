package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class ShiftingLettersII {

    public static void main(String[] args) {
        System.out.println(shiftingLetters("abc", new int[][]{{0, 1, 0}, {1, 2, 1}, {0, 2, 1}}));
    }

    public static String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] arr = new int[n];
        for (int[] shift : shifts) {
            arr[shift[0]] += (shift[2] == 1 ? 1 : -1);
            if (shift[1] + 1 < n) arr[shift[1] + 1] += (shift[2] == 1 ? -1 : 1);
        }
        return getResult(s, n, arr);
    }

    private static String getResult(String s, int n, int[] arr) {
        StringBuilder result = new StringBuilder(s);
        int numberOfShifts = 0;
        for (int i = 0; i < n; i++) {
            numberOfShifts = (numberOfShifts + arr[i]) % 26;
            if (numberOfShifts < 0) numberOfShifts += 26;
            char shiftedChar = (char) ('a' + ((s.charAt(i) - 'a' + numberOfShifts) % 26));
            result.setCharAt(i, shiftedChar);
        }
        return result.toString();
    }
}
