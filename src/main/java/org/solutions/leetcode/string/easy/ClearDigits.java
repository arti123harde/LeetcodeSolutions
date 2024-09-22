package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ClearDigits {

    public static void main(String[] args) {
        System.out.println(clearDigits("abc"));
        System.out.println(clearDigits("cb34"));
        System.out.println(clearDigits("23232cdsdb34"));
    }

    public static String clearDigits(String s) {
        StringBuilder s1 = new StringBuilder(s);
        while (!s1.isEmpty()){
            int digitIndex = -1;
            for(int i=0; i<s1.length(); i++){
                if(Character.isDigit(s1.charAt(i))){
                    digitIndex = i;
                    break;
                }
            }
            if(digitIndex == -1){
                break;
            }else{
                String p2 = s1.substring(digitIndex+1);
                StringBuilder p1 = new StringBuilder();
                boolean firstCharRemoved = false;
                for(int j=digitIndex-1; j>=0; j--){
                    if(Character.isDigit(s1.charAt(j)) || firstCharRemoved){
                        p1.insert(0, s1.charAt(j));
                    }else{
                        firstCharRemoved = true;
                    }
                }
                s1 = new StringBuilder(p1 + p2);
            }
        }
        return s1.toString();
    }
}