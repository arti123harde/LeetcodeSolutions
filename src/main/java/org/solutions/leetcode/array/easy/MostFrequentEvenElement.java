package org.solutions.leetcode.array.easy;

/**
 * @author Arti Harde
 */
public class MostFrequentEvenElement {

    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[]{0,1,2,2,4,4,1}));
        System.out.println(mostFrequentEven(new int[]{4,4,4,9,2,4}));
        System.out.println(mostFrequentEven(new int[]{29,47,21,41,13,37,25,7}));
    }

    public static int mostFrequentEven(int[] nums) {
        //Approach 1
        int[] arr = new int[500001];
        int maxOccurance = 0;
        int minNumber = -1;
        for(int n: nums){
            if(n % 2 == 0){
                arr[n]++;
                if(arr[n] > maxOccurance || (arr[n] == maxOccurance && minNumber > n)){
                    maxOccurance = arr[n];
                    minNumber = n;
                }
            }
        }
        return minNumber;

        //Approach 2
//        Map<Integer, Integer> map = new TreeMap<>();
//        for(int n : nums) if(n % 2 == 0) map.put(n, map.getOrDefault(n, 0) + 1);
//        if(!map.isEmpty()){
//            LinkedHashMap<Integer, Integer> sortedMap = map.entrySet()
//                    .stream()
//                    .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
//                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//            return map.keySet().stream().findFirst().get();
//        }else return -1;

    }


}