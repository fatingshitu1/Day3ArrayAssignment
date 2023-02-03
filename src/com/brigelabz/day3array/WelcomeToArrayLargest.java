package com.brigelabz.day3array;

public class WelcomeToArrayLargest {
    public static void main(String[] args) {
        System.out.println("Welcome to Array class");

        int[] array = {10,20,50,100,60,80,90,70,30};
        int maxmumElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxmumElement) {
                maxmumElement = array[i];
            }
        }
        System.out.println("The largest element of the array is " + maxmumElement);
    }
}


