package com.springrest.springrest.entity;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCountsInString {

    public static void main(String[] args) {
        String s="javajavajee";

        Map<Character,Integer> mp= new HashMap<>();
        char[] chars=s.toCharArray();

        for(Character c:chars){
            if (mp.containsKey(c)){
                mp.put(c, mp.get(c) + 1);
                }
            else{
                mp.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() +"  "+ entry.getValue());
            }
        }
    }
}
