package org.solutions.leetcode.string.medium;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class DesignUndergroundSystem {

    public static void main(String[] args) {
        DesignUndergroundSystem designUndergroundSystem = new DesignUndergroundSystem();
        designUndergroundSystem.checkIn(45,"Leyton",3);
        designUndergroundSystem.checkIn(32,"Paradise",8);
        designUndergroundSystem.checkIn(27,"Leyton",10);
        designUndergroundSystem.checkOut(45,"Waterloo",15);
        designUndergroundSystem.checkOut(27,"Waterloo",20);
        designUndergroundSystem.checkOut(32,"Cambridge",22 );
        System.out.println(designUndergroundSystem.getAverageTime("Paradise","Cambridge"));
        System.out.println(designUndergroundSystem.getAverageTime("Leyton","Waterloo" ));
        designUndergroundSystem.checkIn(10,"Leyton",24);
        System.out.println(designUndergroundSystem.getAverageTime("Leyton","Waterloo"));
        designUndergroundSystem.checkOut(10,"Waterloo",38);
        System.out.println(designUndergroundSystem.getAverageTime("Leyton","Waterloo"));
    }

    public DesignUndergroundSystem() {

    }

    Map<Integer, Pair<String, Integer>> checkIn = new HashMap<>();
    Map<String, Pair<Double, Integer>> tripData = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        checkIn.put(id, new Pair<>(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        String tripKey = getTripKey(checkIn.get(id).getKey(), stationName);
        if(!tripData.containsKey(tripKey)) tripData.put(tripKey, new Pair<>(0.0, 0));
        tripData.put(tripKey, new Pair<>(tripData.get(tripKey).getKey() + (t - checkIn.get(id).getValue()),
                tripData.get(tripKey).getValue() + 1));
        checkIn.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String tripKey = getTripKey(startStation, endStation);
        return (double) tripData.get(tripKey).getKey() / tripData.get(tripKey).getValue();
    }

    public String getTripKey(String s1, String s2){
        return s1 + "_" + s2;
    }
}