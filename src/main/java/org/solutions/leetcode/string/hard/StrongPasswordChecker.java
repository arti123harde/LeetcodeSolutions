package org.solutions.leetcode.string.hard;

/**
 * @author Arti Harde
 */
public class StrongPasswordChecker {

    public static void main(String[] args) {
        System.out.println(strongPasswordChecker("1111111111"));
        System.out.println(strongPasswordChecker("aaa111"));
        System.out.println(strongPasswordChecker("aaAA11"));
        System.out.println(strongPasswordChecker("aaa123"));
        System.out.println(strongPasswordChecker("a"));
        System.out.println(strongPasswordChecker("aA1"));
        System.out.println(strongPasswordChecker("1337C0d3"));
    }

    public static int strongPasswordChecker(String password) {
        int missingDigitCount = 1;
        int missingLowerCaseCount = 1;
        int missingUppercaseChar = 1;
        int[] repeatedCount = new int[password.length()];
        int j=0;
        while(j<password.length()){
            if(Character.isLowerCase(password.charAt(j))) missingLowerCaseCount = 0;
            else if(Character.isUpperCase(password.charAt(j))) missingUppercaseChar = 0;
            else if(Character.isDigit(password.charAt(j))) missingDigitCount = 0;
            int index = j;
            while (j<password.length() && password.charAt(j) == password.charAt(index)) j++;
            repeatedCount[index] = j - index;
        }
        int totalMissingCount = missingDigitCount + missingLowerCaseCount + missingUppercaseChar;
        if(password.length() < 6) return Math.max(6 - password.length(), totalMissingCount);
        else{
            int result = 0;
            int extraLength = Math.max(password.length() - 20, 0);
            int remainingRepeats = 0;
            result += extraLength;
            for (int k = 1; k < 3; k++) {
                for (int i = 0; i < password.length() && extraLength > 0; i++) {
                    if (repeatedCount[i] < 3 || repeatedCount[i] % 3 != (k - 1)) continue;
                    int reduction = Math.min(extraLength, k);
                    repeatedCount[i] -= reduction;
                    extraLength -= reduction;
                }
            }
            for (int i = 0; i < password.length(); i++) {
                if (repeatedCount[i] >= 3 && extraLength > 0) {
                    int reduction = repeatedCount[i] - 2;
                    repeatedCount[i] -= extraLength;
                    extraLength -= reduction;
                }
                if (repeatedCount[i] >= 3) remainingRepeats += repeatedCount[i] / 3;
            }
            result += Math.max(totalMissingCount, remainingRepeats);
            return result;
        }
    }
}