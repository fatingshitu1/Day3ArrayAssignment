package com.brigelabz.day3array;

public class SmallestNumber {
    public static void main(String[] args) {

        int[] array = {10, 25, 30, 42, 51, 65, 70, 80, 75, 60, 50, 45, 37, 20, 100};
        int minimumElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimumElement) {
                minimumElement = array[i];
            }
        }
        System.out.println("The smallest element of the array is " + minimumElement);
    }
}
