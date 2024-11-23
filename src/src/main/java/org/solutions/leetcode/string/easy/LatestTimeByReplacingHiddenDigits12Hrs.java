package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class LatestTimeByReplacingHiddenDigits12Hrs {

    public static void main(String[] args) {
        System.out.println(maximumTime("1?:?4"));
        System.out.println(maximumTime("0?:5?"));
        System.out.println(maximumTime("?1:?6"));
    }

    public static String maximumTime(String time) {
        char[] t = time.toCharArray();
        if(t[0] == '?' && t[1] == '?'){
            t[0] = '1';
            t[1] = '1';
        }else if(t[0] == '?' && t[1] != '?'){
            if(t[1] < '2'){
                t[0] = '1';
            }else {
                t[0] = '0';
            }
        }else if(t[1] == '?' && t[0] != '?'){
            if(t[0] == '1'){
                t[1] = '1';
            }else {
               t[1] = '9';
            }
        }
        if(t[3] == '?' && t[4] == '?'){
            t[3] = '5';
            t[4] = '9';
        }else if(t[3] == '?' && t[4] != '?'){
            t[3] = '5';
        }else if(t[4] == '?' && t[3] != '?'){
            t[4] = '9';
        }
        return new String(t);
    }
}