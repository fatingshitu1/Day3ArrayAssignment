package com.brigelabz.day3array;

public class EvenPosition {
    public static void main(String[] args) {

        String[] array = {"Mumbai", "Delhi", "Kolkata", "Nagpur", "Bangalore", "Pune", "Chennai"};
        int arrayIndex = 0;
        for (int i = 1; i <= array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("The even index number is: " + i + " And the element of the index is: " + array[i]);
            }
        }
    }
}