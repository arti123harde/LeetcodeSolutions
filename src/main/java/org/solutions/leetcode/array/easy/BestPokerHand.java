package demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class BestPokerHand {

    public static void main(String[] args) {
        System.out.println(bestHand(new int[]{13,2,3,1,9}, new char[]{'a','a','a','a','a'}));
    }

    public static String bestHand(int[] ranks, char[] suits) {
        if(checkFlush(suits)) return "Flush";
        else if(checkThreeOfAKind(ranks)) return "Three of a Kind";
        else if (checkPair(ranks)) return "Pair";
        else return "High Card";
    }

    private static boolean checkFlush(char[] suits){
        Set<Character> set = new HashSet<>();
        for(char c : suits){
            set.add(c);
        }
        return set.size() == 1;
    }

    private static boolean checkThreeOfAKind(int[] ranks){
        int[] arr = new int[14];
        for(int n : ranks) arr[n]++;
        for(int n : arr) if(n >= 3) return true;
        return false;
    }

    private static boolean checkPair(int[] ranks){
        int[] arr = new int[14];
        for(int n : ranks) arr[n]++;
        for(int n : arr) if(n >= 2) return true;
        return false;
    }

}