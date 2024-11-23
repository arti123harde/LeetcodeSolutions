package org.solutions.leetcode.string.easy;

import java.util.List;

public class SnakeMatrix {

    public static void main(String[] args) {
        System.out.println(finalPositionOfSnake(2, List.of("RIGHT","DOWN")));
        System.out.println(finalPositionOfSnake(3, List.of("DOWN","RIGHT","UP")));
    }

    public static int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0;
        int y = 0;
//        for(String s : commands){
//            switch(s){
//                case "RIGHT" :
//                    y++;
//                    break;
//                case "LEFT" :
//                    y--;
//                    break;
//                case "UP" :
//                    x--;
//                    break;
//                case "DOWN" :
//                    x++;
//                    break;
//            }
//        }


        for(String s : commands){
            if("UP".equals(s)) x--;
            if("DOWN".equals(s)) x++;
            if("LEFT".equals(s)) y--;
            if("RIGHT".equals(s)) y++;
        }
        return (x * n) + y;
    }
}
