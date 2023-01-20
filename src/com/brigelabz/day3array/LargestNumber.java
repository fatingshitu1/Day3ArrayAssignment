package com.brigelabz.day3array;

public class LargestNumber {
    public static void main(String[] args) {
        int array[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int largest = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array [i] > largest)
                System.out.println("The Largest number is : " + largest);
        }
    }
}