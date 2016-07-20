package com.brainacad.oop.testgenerics2;

public class Main {

    public static void main(String[] args) {

        // Lab Work 2-14-1 and Lab Work 2-14-2
        System.out.println("Lab Work 2-14-1 and Lab Work 2-14-2");
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};

        System.out.println(MyTestMethod.calcNum(arr1, 3));
        System.out.println(MyTestMethod.calcNum(arr2, 3.0));

        // Lab Work 2-14-3
        System.out.println("Lab Work 2-14-3");

        System.out.println(MyTestMethod.calcSum(arr1, 3));
        System.out.println(MyTestMethod.calcSum(arr2, 3.0));

    }
}
