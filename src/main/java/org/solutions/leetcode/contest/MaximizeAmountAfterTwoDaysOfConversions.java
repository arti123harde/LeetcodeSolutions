package org.solutions.leetcode.contest;

import java.lang.Double;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class MaximizeAmountAfterTwoDaysOfConversions {

    private static final int SCALE_FACTOR = 100000; // Precision of 5 decimal places (10^5)

    public static void main(String[] args) {

    }

    public static double maxAmount(String initialCurrency, List<List<String>> pairs1,
                                   double[] rates1, List<List<String>> pairs2, double[] rates2) {
        Map<String, Map<String, Long>> graphDay1 = buildGraph(pairs1, rates1);
        Map<String, Map<String, Long>> graphDay2 = buildGraph(pairs2, rates2);
        floydWarshall(graphDay1);
        floydWarshall(graphDay2);
        long maxAmount = SCALE_FACTOR;
        if (!graphDay1.containsKey(initialCurrency)) return 1.0;
        Map<String, Long> amountAfterDay1 = new HashMap<>();
        for (String currencyDay1 : graphDay1.get(initialCurrency).keySet()) {
            long amount = maxAmount * graphDay1.get(initialCurrency).get(currencyDay1) / SCALE_FACTOR;
            amountAfterDay1.put(currencyDay1, amount);
        }
        for (String currencyDay1 : amountAfterDay1.keySet()) {
            long amountDay1 = amountAfterDay1.get(currencyDay1);
            if (!graphDay2.containsKey(currencyDay1)) continue;
            for (String currencyDay2 : graphDay2.get(currencyDay1).keySet()) {
                if (graphDay2.get(currencyDay1).containsKey(currencyDay2) && graphDay2.get(currencyDay2).containsKey(initialCurrency)) {
                    long amountDay2 = amountDay1 * graphDay2.get(currencyDay1).get(currencyDay2) / SCALE_FACTOR;
                    amountDay2 = amountDay2 * graphDay2.get(currencyDay2).get(initialCurrency) / SCALE_FACTOR;
                    maxAmount = Math.max(maxAmount, amountDay2);
                }
            }
        }
        return maxAmount / (double) SCALE_FACTOR;
    }

    private static Map<String, Map<String, Long>> buildGraph(List<List<String>> pairs, double[] rates) {
        Map<String, Map<String, Long>> graph = new HashMap<>();
        for (int i = 0; i < pairs.size(); i++) {
            String from = pairs.get(i).get(0);
            String to = pairs.get(i).get(1);
            long rate = (long) (rates[i] * SCALE_FACTOR);
            graph.putIfAbsent(from, new HashMap<>());
            graph.putIfAbsent(to, new HashMap<>());
            graph.get(from).put(to, rate);
            graph.get(to).put(from, SCALE_FACTOR * SCALE_FACTOR / rate);
        }
        return graph;
    }

    private static void floydWarshall(Map<String, Map<String, Long>> graph) {
        for (String k : graph.keySet()) {
            for (String i : graph.keySet()) {
                for (String j : graph.keySet()) {
                    if (graph.get(i).containsKey(k) && graph.get(k).containsKey(j)) {
                        long newRate = graph.get(i).get(k) * graph.get(k).get(j) / SCALE_FACTOR;
                        graph.get(i).put(j, Math.max(graph.get(i).getOrDefault(j, 0L), newRate));
                    }
                }
            }
        }
    }
}
