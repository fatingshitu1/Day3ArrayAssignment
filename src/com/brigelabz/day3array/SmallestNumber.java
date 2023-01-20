package com.brigelabz.day3array;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        int max = array[0];
        {
            System.out.println("The element is largest");
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                System.out.println(array[i]);
        }

    }
}