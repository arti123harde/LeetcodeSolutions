package org.solutions.leetcode.array.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicate2 {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{313,64,612,515,412,661,244,164,492,744,233,579,62,786,342,
                817,838,396,230,79,570,702,124,727,586,542,919,372,187,626,869,923,103,932,368,891,411,125,724,287,575,
                326,88,125,746,117,363,8,881,441,542,653,211,180,620,175,747,276,832,772,165,733,574,186,778,586,601,165,
                422,956,357,134,857,114,450,64,494,679,495,205,859,136,477,879,940,139,903,689,954,335,859,78,20}, 22));
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }else{
                if(i - map.get(nums[i]) <= k){
                    count++;
                }
                map.put(nums[i], i);
            }
        }
        return count > 0;
    }
}
