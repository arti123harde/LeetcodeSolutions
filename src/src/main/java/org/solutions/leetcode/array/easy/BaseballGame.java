package org.solutions.leetcode.array.easy;

public class BaseballGame {

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
        System.out.println(calPoints(new String[]{"1","C"}));
    }

    public static int calPoints(String[] operations) {
        int result = 0;
        int index = 0;
        int[] scores = new int[operations.length];
        for(String s : operations){
            if(index != 0 && s.equals("D")) {
                scores[index] = scores[index - 1] * 2;
                index++;
            }
            else if(index != 0 && s.equals("C")) {
                scores[index - 1] = 0;
                index--;
            }
            else if(index >=2 && s.equals("+")) {
                scores[index] = scores[index - 1] + scores[index - 2];
                index++;
            }
            else{
                scores[index] = Integer.parseInt(s);
                index++;
            }
        }
        for(int i : scores){
            result += i;
        }
        return  result;
    }
}
