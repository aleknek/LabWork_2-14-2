package com.brainacad.oop.testgenerics2;

public class MyTestMethod {

    public static <T extends Comparable> int calcNum(T[] arr, T maxElm) {

        int counter = 0;

        for (T arrElem : arr) {
            if (arrElem.compareTo(maxElm) == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static <T extends Number> double calcSum(T[] arr, T maxElm){

        double sum = 0;

        for (T arrElem : arr) {
            if (arrElem.doubleValue() > maxElm.doubleValue()){
                sum = sum + arrElem.doubleValue();
            }
        }
        return sum;
    }

}
