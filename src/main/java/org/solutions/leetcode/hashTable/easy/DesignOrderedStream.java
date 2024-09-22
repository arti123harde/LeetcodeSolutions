package org.solutions.leetcode.hashTable.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class DesignOrderedStream {

    private String[] stream;

    public static void main(String[] args) {
        DesignOrderedStream designOrderedStream = new DesignOrderedStream(5);
        System.out.println(designOrderedStream.insert(3, "ccccc"));
        System.out.println(designOrderedStream.insert(1, "aaaaa"));
        System.out.println(designOrderedStream.insert(2, "bbbbb"));
        System.out.println(designOrderedStream.insert(5, "eeeee"));
        System.out.println(designOrderedStream.insert(4, "ddddd"));
    }

    public DesignOrderedStream(int n) {
        stream = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        List<String> result = new ArrayList<>();
        stream[idKey-1] = value;
        for(int i=0; i<stream.length; i++){
            if(stream[i] != null){
                if(i >= idKey-1){
                    result.add(stream[i]);
                }
            }else {
                break;
            }
        }
        return result;
    }

}