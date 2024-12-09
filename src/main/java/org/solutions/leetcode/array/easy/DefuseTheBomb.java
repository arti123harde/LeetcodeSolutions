package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class DefuseTheBomb {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decrypt(new int[]{2,4,9,3}, -2)));
        System.out.println(Arrays.toString(decrypt(new int[]{5, 7, 1, 4}, 3)));
        System.out.println(Arrays.toString(decrypt(new int[]{1,2,3,4}, 0)));
    }

    public static int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        if(k == 0) return arr;
        if(k > 0){
            for(int i=0; i<code.length; i++){
                int sum = 0;
                int n = k;
                int index = i+1 > code.length-1 ? 0 : i+1;
                while (n > 0){
                    sum += code[index];
                    index = index+1 > code.length-1 ? 0 : ++index;
                    n--;
                }
                arr[i] = sum;
            }
        }else {
            for(int i=0; i<code.length; i++){
                int sum = 0;
                int n = -k;
                int index = i == 0 ? code.length-1 : i-1;
                while (n > 0){
                    sum += code[index];
                    index = index-1 < 0 ? code.length-1 : index-1;
                    n--;
                }
                arr[i] = sum;
            }
        }
        return arr;
    }
}
