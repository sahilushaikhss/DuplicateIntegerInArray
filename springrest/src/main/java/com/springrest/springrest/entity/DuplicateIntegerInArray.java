package com.springrest.springrest.entity;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateIntegerInArray {

    public static void main(String[] args){
        Integer[] arr1 = {5, 4, 1, 0, 7};
        Integer[] arr2 = {7, 5, 9, 4, 8};
      //  System.out.println("Array1" + arr1);
       // System.out.println("Array1" + arr1);
        System.out.println("Common Elements ");
        findCommonElement(arr1, arr2);
    }
    private static void findCommonElement(Integer[] arr1,Integer[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    set.add(arr1[i]);
                }
            }
        }
        for (Integer i : set) {
            System.out.println(i + " ");
            }
        ArrayList <Integer> al=new ArrayList<>(set);
        Integer sum= al.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        }

    }