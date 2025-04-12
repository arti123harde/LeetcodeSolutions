package org.solutions.leetcode.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/**
 * @author Arti Harde
 */
public class FindLexicographicallyLargestStringFromTheBoxI {

    public static void main(String[] args) {
        System.out.println(answerString("bif", 2));
        System.out.println(answerString("dbca", 2));
        System.out.println(answerString("gggg", 4));
    }

    //DP
    public static String answerString(String word, int numFriends) {
        int n = word.length();
        if (numFriends == 1) {
            return word; // If only one friend, the entire word is the result.
        }

        // DP table to store the results.
        String[][] dp = new String[n][numFriends + 1];

        // Solve using recursion with memoization.
        return solve(word, 0, numFriends, dp);
    }

    private static String solve(String word, int index, int splits, String[][] dp) {
        int n = word.length();

        // Base case: if only one split is left, take the rest of the string.
        if (splits == 1) {
            return word.substring(index);
        }

        // If already computed, return the cached result.
        if (dp[index][splits] != null) {
            return dp[index][splits];
        }

        String best = "";

        // Iterate through all possible split points.
        for (int i = index; i <= n - splits; i++) {
            String current = word.substring(index, i + 1);
            String next = solve(word, i + 1, splits - 1, dp);

            // Choose the lexicographically largest option.
            if (current.compareTo(best) > 0) {
                best = current;
            }

            // Update the result only if the next split produces a better result overall.
            String candidate = best;
            if (next.compareTo(best) > 0) {
                candidate = next;
            }

            dp[index][splits] = candidate;
        }

        // Store the result in the dp table.
        return dp[index][splits];
    }

    //BackTracking
    public static String answerString1(String word, int numFriends) {
        if (numFriends == 1) return word; // If only one friend, the entire word is the result.
        AtomicReference<String> largest = new AtomicReference<>("");
        generateSplits(word, numFriends, 0, new ArrayList<>(), new HashSet<>(), (split) -> {
            for (String part : split) if (part.compareTo(largest.get()) > 0) largest.set(part);
        });
        return largest.get();
    }

    //backTracking
    private static void generateSplits(String word, int numFriends, int start, List<String> currentSplit, Set<String> seenSplits, Consumer<List<String>> processSplit) {
        if (currentSplit.size() == numFriends) {
            if (start == word.length()) {
                String serializedSplit = String.join("|", currentSplit);
                if (!seenSplits.contains(serializedSplit)) {
                    seenSplits.add(serializedSplit);
                    processSplit.accept(new ArrayList<>(currentSplit));
                }
            }
            return;
        }
        for (int i = start + 1; i <= word.length(); i++) {
            String part = word.substring(start, i);
            currentSplit.add(part);
            generateSplits(word, numFriends, i, currentSplit, seenSplits, processSplit);
            currentSplit.remove(currentSplit.size() - 1);
        }
    }
}
