package com.hillel.korobkov.homeworks.homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1;
        String str2;

        str1 = "Show must go on";
        str2 = "On go must wosh";
        System.out.println("Input1 - " + str1);
        System.out.println("Input2 - " + str2);

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        if (arr1.length != arr2.length) {
            System.out.println("Not an anagramm");
            System.exit(0);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean a = Arrays.equals(arr2, arr1);

//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] != arr2[i]){
//                System.out.println("Not an anagramm");
//                System.exit(0);
//            }
//        }
        System.out.println(a);
    }
}



