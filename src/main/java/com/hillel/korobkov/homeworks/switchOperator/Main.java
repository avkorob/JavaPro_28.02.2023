package com.hillel.korobkov.homeworks.switchOperator;

public class Main {
    public static void main(String[] args) {

        int a = 5;

        String out = switch (a) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            default -> "error";
        };

        System.out.println(out);
    }
}
